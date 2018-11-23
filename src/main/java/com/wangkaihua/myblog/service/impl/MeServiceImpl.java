package com.wangkaihua.myblog.service.impl;

import com.wangkaihua.myblog.entity.TbMe;
import com.wangkaihua.myblog.mapper.TbMeMapper;
import com.wangkaihua.myblog.service.MeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangkaihua
 * @create 2018-11-23 14:57
 **/
@Service
public class MeServiceImpl implements MeService {

    @Autowired
    private TbMeMapper tbMeMapper;


    @Override
    public TbMe findOne(int id) {
        return tbMeMapper.selectByPrimaryKey(id);
    }
}
