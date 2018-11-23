package com.wangkaihua.myblog.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wangkaihua.myblog.common.PageResult;
import com.wangkaihua.myblog.entity.TbBlogWithBLOBs;
import com.wangkaihua.myblog.mapper.TbBlogMapper;
import com.wangkaihua.myblog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public List<TbBlogWithBLOBs> findAll() {
        return blogMapper.selectByExampleWithBLOBs(null);
    }

    @Override
    public void add(TbBlogWithBLOBs blog) {
        blog.setCreateTime(new Date());
        blog.setUpdateTime(new Date());
        blog.setHits(0);
        blogMapper.insert(blog);
    }

    @Override
    public void delete(int[] ids) {
        for(int id : ids){
            blogMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public TbBlogWithBLOBs findOne(int id) {
        return blogMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        Page<TbBlogWithBLOBs> page = (Page<TbBlogWithBLOBs>) blogMapper.selectByExampleWithBLOBs(null);
       return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public void update(TbBlogWithBLOBs blog) {
        blog.setUpdateTime(new Date());
        blogMapper.updateByPrimaryKeyWithBLOBs(blog);
    }
}
