package com.wangkaihua.myblog.controller;

import com.wangkaihua.myblog.common.PageResult;
import com.wangkaihua.myblog.common.Result;
import com.wangkaihua.myblog.entity.TbBlog;
import com.wangkaihua.myblog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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

    @RequestMapping("/add")
    public Result add(@RequestBody TbBlog blog){
        try {
            blogService.add(blog);
            return Result.successResult();
        }catch (Exception e){
            e.printStackTrace();
            return Result.failResult();
        }
    }

    @RequestMapping("/delete")
    public Result delete(int [] ids){
        try {
            blogService.delete(ids);
            return Result.successResult();
        }catch (Exception e){
            e.printStackTrace();
            return Result.failResult();
        }
    }

    @RequestMapping("/findPage")
    public PageResult findPage(int pageNum ,int pageSize){
        return blogService.findPage(pageNum,pageSize);
    }
    @RequestMapping("findOne")
    public TbBlog findOne(int id){
        return blogService.findOne(id);
    }

    /**
     * 专门用于Editormd显示博文内容
     * 解决angular整合editormd后{{entity.content}}无法取到内容的问题
     * */
    @RequestMapping("findBlogToEditormd")
    public String findBlogToEditormd(int id){
        return blogService.findOne(id).getContent();
    }
}
