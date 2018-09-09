package com.wangkaihua.myblog.service;

import com.wangkaihua.myblog.entity.TbCategory;

import java.util.List;

/**
 * @author wangkaihua
 * @create 2018-09-04 16:25
 **/
public interface CategoryService {
    List<TbCategory> findAll();

    void add(TbCategory category);

    void update(TbCategory category);

    TbCategory findOne(int id);

    void delete(int[] ids);
}
