package com.wangkaihua.myblog.service;

import com.wangkaihua.myblog.common.PageResult;
import com.wangkaihua.myblog.entity.TbBlog;

import java.util.List;

/**
 * @author wangkaihua
 * @create 2018-08-29 21:55
 **/
public interface BlogService {

    List<TbBlog> findAll();

    void add(TbBlog blog);

    void delete(int[] ids);

    TbBlog findOne(int id);

    PageResult findPage(int pageNum, int pageSize);
}
