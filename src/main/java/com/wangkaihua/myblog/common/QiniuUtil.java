package com.wangkaihua.myblog.common;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;

/**
 * @author wangkaihua
 * @create 2018-12-11 15:46
 **/
@Component
public class QiniuUtil {

    @Value("${qiniu.accessKey}")
    private String accessKey;

    @Value("${qiniu.secretKey}")
    private String secretKey;

    @Value("${qiniu.bucket}")
    private String bucket;

    @Value("${qiniu.path}")
    private String path;

    /**
     * 将图片上传到七牛云
     * @param file
     * @return
     */
    public  String uploadImg(FileInputStream file) throws QiniuException {
        UploadManager uploadManager = new UploadManager(createConfigration());
        String upToken = createAuth().uploadToken(bucket);
        // key 保存在空间中的名字，如果为空会使用文件的hash值为文件名
        String key = null;
        Response response = uploadManager.put(file,key, upToken, null, null);
        //解析上传成功的结果
        DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
        return path+"/"+putRet.key;
    }

    /**
     * 删除上传的图片
     * @param key
     */
    public void deleteImg(String key) throws QiniuException {
        BucketManager bucketManager = new BucketManager(createAuth(), createConfigration());
        bucketManager.delete(bucket, key);
    }

    /**
     * 生成上传凭证
     * @return
     */
    private Auth createAuth() {
        return Auth.create(accessKey, secretKey);
    }

    /**
     * 构造一个带指定Zone对象的配置类
     * @return
     */
    private Configuration createConfigration() {
        return new Configuration(Zone.zone0());
    }
}
