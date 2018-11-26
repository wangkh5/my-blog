package com.wangkaihua.myblog.service;

import java.util.List;

/**
 * @author wangkaihua
 * @create 2018-11-26 20:30
 **/
public interface BlogTagService {

    /**
     * 查询指定博文所引用的所有标签的id
     * @param blogId
     * @return 博文引用的标签集合
     */
    List<Integer> findTagsIdByBlogId(Integer blogId);

    /**
     * 删除指定博文的所有标签
     * @param blogId
     */
    void deleteAllBlogTagByBlogId(Integer blogId);

    /**
     * 批量保存指定博文的所有标签
     * @param tagIdList
     * @param blogId
     */
    void insertBlogTagBatch(List<Integer> tagIdList, Integer blogId);
}
