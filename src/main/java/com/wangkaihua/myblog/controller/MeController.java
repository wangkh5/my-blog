package com.wangkaihua.myblog.controller;

import com.wangkaihua.myblog.entity.TbMe;
import com.wangkaihua.myblog.service.MeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangkaihua
 * @create 2018-11-23 15:06
 **/
@RestController
@RequestMapping("/me")
public class MeController {
    @Autowired
    private MeService meService;

    @RequestMapping("/findOne")
    public TbMe findOne(int id){
        return meService.findOne(id);
    }

}
