package com.wangkaihua.myblog.service.impl;

import com.wangkaihua.myblog.entity.TbTag;
import com.wangkaihua.myblog.mapper.TbTagMapper;
import com.wangkaihua.myblog.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangkaihua
 * @create 2018-09-04 16:25
 **/
@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TbTagMapper tagMapper;

    @Override
    public List<TbTag> findAll() {
        return tagMapper.selectByExample(null);
    }

    @Override
    public void add(TbTag tag) {
        tagMapper.insert(tag);
    }

    @Override
    public void update(TbTag tag) {
        tagMapper.updateByPrimaryKey(tag);
    }

    @Override
    public TbTag findOne(int id) {
        return tagMapper.selectByPrimaryKey(id);
    }

    @Override
    public void delete(int[] ids) {
        for(int id : ids){
            tagMapper.deleteByPrimaryKey(id);
        }
    }

}
