package com.wangkaihua.myblog.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wangkaihua.myblog.common.PageResult;
import com.wangkaihua.myblog.entity.TbBlog;
import com.wangkaihua.myblog.entity.vo.BlogVO;
import com.wangkaihua.myblog.mapper.TbBlogMapper;
import com.wangkaihua.myblog.service.BlogService;
import com.wangkaihua.myblog.service.BlogTagService;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author wangkaihua
 * @create 2018-08-29 21:55
 **/
@Service
public class BlogServiceImpl implements BlogService{

    @Autowired
    private TbBlogMapper blogMapper;
    @Autowired
    private Mapper dozerBeanMapper;
    @Autowired
    private BlogTagService blogTagService;

    @Override
    public List<TbBlog> findAll() {
        return blogMapper.selectByExampleWithBLOBs(null);
    }

    @Override
    @Transactional
    public void add(BlogVO blogVO) {
        TbBlog blog = dozerBeanMapper.map(blogVO, TbBlog.class);
        blog.setCreateTime(new Date());
        blog.setUpdateTime(new Date());
        blog.setHits(0);
        blogMapper.insert(blog);

        //保存该博文的所有标签
        blogTagService.insertBlogTagBatch(blogVO.getTags(), blog.getId());
    }

    @Override
    public void delete(int[] ids) {
        for(int id : ids){
            blogMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public BlogVO findOne(int id) {
        TbBlog blog = blogMapper.selectByPrimaryKey(id);
        BlogVO blogVO = dozerBeanMapper.map(blog,BlogVO.class);
        blogVO.setTags(blogTagService.findTagsIdByBlogId(blog.getId()));
        return blogVO;
    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        Page<TbBlog> page = (Page<TbBlog>) blogMapper.selectByExampleWithBLOBs(null);
       return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    @Transactional
    public void update(BlogVO blogVO) {
        TbBlog blog = dozerBeanMapper.map(blogVO, TbBlog.class);
        blog.setUpdateTime(new Date());
        blogMapper.updateByPrimaryKeyWithBLOBs(blog);

        //更新标签，删除所有再新增
        blogTagService.deleteAllBlogTagByBlogId(blog.getId());
        blogTagService.insertBlogTagBatch(blogVO.getTags(),blog.getId());
    }
}
