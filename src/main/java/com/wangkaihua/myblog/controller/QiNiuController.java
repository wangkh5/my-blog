package com.wangkaihua.myblog.controller;

import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.wangkaihua.myblog.common.QiniuUtil;
import com.wangkaihua.myblog.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author wangkaihua
 * @create 2018-12-11 14:02
 **/
@RestController
@RequestMapping("/qiniu")
public class QiNiuController {
    @Autowired
    private QiniuUtil qiniuUtil;

    /**
     * 上传图片
     * @param image
     * @return
     */
    @RequestMapping("/uploadImg")
    public String uploadImg(MultipartFile image){
        FileInputStream inputStream = null;
        try {
            inputStream = (FileInputStream) image.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            return qiniuUtil.uploadImg(inputStream);
        } catch (QiniuException ex) {
            Response r = ex.response;
            System.err.println(r.toString());
            try {
                System.err.println(r.bodyString());
            } catch (QiniuException ex2) {
            }
            return "上传失败";
        }
    }

    /**
     * 删除图片
     * @param key 该图片在七牛oss的key
     * @return
     */
    @RequestMapping("/deleteImg")
    public Result deleteImg(String key){
        try {
            qiniuUtil.deleteImg(key);
        }catch (QiniuException ex) {
            //如果遇到异常，说明删除失败
            System.err.println(ex.code());
            System.err.println(ex.response.toString());
            return Result.failResult();
        }
        return Result.successResult();
    }
}
