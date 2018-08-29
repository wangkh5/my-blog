package com.wangkaihua.myblog.service;

import com.wangkaihua.myblog.entity.TbBlog;

import java.util.List;

/**
 * @author wangkaihua
 * @create 2018-08-29 21:55
 **/
public interface BlogService {

    List<TbBlog> findAll();
}
