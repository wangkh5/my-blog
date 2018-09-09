package com.wangkaihua.myblog.service.impl;

import com.wangkaihua.myblog.entity.TbCategory;
import com.wangkaihua.myblog.mapper.TbCategoryMapper;
import com.wangkaihua.myblog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author wangkaihua
 * @create 2018-09-04 16:25
 **/
@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private TbCategoryMapper categoryMapper;

    @Override
    public List<TbCategory> findAll() {
        return categoryMapper.selectByExample(null);
    }

    @Override
    public void add(TbCategory category) {
        category.setCreateTime(new Date());
        categoryMapper.insert(category);
    }

    @Override
    public void update(TbCategory category) {
        categoryMapper.updateByPrimaryKey(category);
    }

    @Override
    public TbCategory findOne(int id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public void delete(int[] ids) {
        for(int id : ids){
            categoryMapper.deleteByPrimaryKey(id);
        }
    }

}
