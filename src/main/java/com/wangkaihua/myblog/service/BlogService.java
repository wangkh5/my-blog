package com.wangkaihua.myblog.service;

import com.wangkaihua.myblog.common.PageResult;
import com.wangkaihua.myblog.entity.TbBlogWithBLOBs;

import java.util.List;

/**
 * @author wangkaihua
 * @create 2018-08-29 21:55
 **/
public interface BlogService {

    List<TbBlogWithBLOBs> findAll();

    void add(TbBlogWithBLOBs blog);

    void delete(int[] ids);

    TbBlogWithBLOBs findOne(int id);

    PageResult findPage(int pageNum, int pageSize);

    void update(TbBlogWithBLOBs blog);
}
