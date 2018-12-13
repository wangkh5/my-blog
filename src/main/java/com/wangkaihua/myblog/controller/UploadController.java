package com.wangkaihua.myblog.controller;

import com.wangkaihua.myblog.common.QiniuUtil;
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
@RequestMapping("/upload")
public class UploadController {
    @Autowired
    private QiniuUtil qiniuUtil;

    @RequestMapping("/picture")
    public String picture(MultipartFile image){
        FileInputStream inputStream = null;
        try {
            inputStream = (FileInputStream) image.getInputStream();
            return qiniuUtil.uploadImg(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return "上传失败";
        }
    }
}
