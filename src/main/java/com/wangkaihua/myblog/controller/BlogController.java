package com.wangkaihua.myblog.controller;

import com.wangkaihua.myblog.entity.TbBlog;
import com.wangkaihua.myblog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wangkaihua
 * @create 2018-08-29 21:50
 **/

@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    BlogService blogService;

    @RequestMapping("/findAll")
    public List<TbBlog> findAll(){
        return blogService.findAll();
    }
}
