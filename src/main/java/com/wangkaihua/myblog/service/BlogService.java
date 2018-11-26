package com.wangkaihua.myblog.service;

import com.wangkaihua.myblog.common.PageResult;
import com.wangkaihua.myblog.entity.TbBlog;
import com.wangkaihua.myblog.entity.vo.BlogVO;

import java.util.List;

/**
 * @author wangkaihua
 * @create 2018-08-29 21:55
 **/
public interface BlogService {

    List<TbBlog> findAll();

    void add(BlogVO blogVO);

    void delete(int[] ids);

    BlogVO findOne(int id);

    PageResult findPage(int pageNum, int pageSize);

    void update(BlogVO blogVO);
}
