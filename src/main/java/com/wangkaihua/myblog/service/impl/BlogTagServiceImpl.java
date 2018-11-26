package com.wangkaihua.myblog.service.impl;

import com.wangkaihua.myblog.entity.TbBlogTag;
import com.wangkaihua.myblog.entity.TbBlogTagExample;
import com.wangkaihua.myblog.mapper.TbBlogTagMapper;
import com.wangkaihua.myblog.service.BlogTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;

/**
 * @author wangkaihua
 * @create 2018-11-26 20:39
 **/
@Service
public class BlogTagServiceImpl implements BlogTagService {
    @Autowired
    private TbBlogTagMapper blogTagMapper;

    @Override
    public List<Integer> findTagsIdByBlogId(Integer blogId) {
        TbBlogTagExample blogTagExample = new TbBlogTagExample();
        blogTagExample.createCriteria().andBlogIdEqualTo(blogId);
        List<TbBlogTag> blogTagList = blogTagMapper.selectByExample(blogTagExample);
        List<Integer> result = new LinkedList<Integer>();
        for(TbBlogTag blogTag : blogTagList){
            result.add(blogTag.getTagId());
        }
        return result;
    }

    @Override
    public void deleteAllBlogTagByBlogId(Integer blogId) {
        TbBlogTagExample blogTagExample = new TbBlogTagExample();
        blogTagExample.createCriteria().andBlogIdEqualTo(blogId);
        blogTagMapper.deleteByExample(blogTagExample);
    }

    @Override
    @Transactional
    public void insertBlogTagBatch(List<Integer> tagIdList, Integer blogId) {
        TbBlogTag blogTag = new TbBlogTag();
        blogTag.setBlogId(blogId);

        for(Integer tagId : tagIdList){
            blogTag.setTagId(tagId);
            blogTagMapper.insert(blogTag);
        }
    }
}
