package com.wangkaihua.myblog.service;

import com.wangkaihua.myblog.entity.TbTag;

import java.util.List;

/**
 * @author wangkaihua
 * @time  2018/11/24 11:51
 */
public interface TagService {
    List<TbTag> findAll();

    void add(TbTag tag);

    void update(TbTag tag);

    TbTag findOne(int id);

    void delete(int[] ids);

    List<String> getBlogTagNameList(List<Integer> tagIdList);
}
