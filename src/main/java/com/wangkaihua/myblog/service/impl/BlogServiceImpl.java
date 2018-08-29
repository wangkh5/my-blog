package com.wangkaihua.myblog.service.impl;

import com.wangkaihua.myblog.entity.TbBlog;
import com.wangkaihua.myblog.mapper.TbBlogMapper;
import com.wangkaihua.myblog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangkaihua
 * @create 2018-08-29 21:55
 **/
@Service
public class BlogServiceImpl implements BlogService{

    @Autowired
    private TbBlogMapper blogMapper;

    @Override
    public List<TbBlog> findAll() {
        return blogMapper.selectByExample(null);
    }
}
