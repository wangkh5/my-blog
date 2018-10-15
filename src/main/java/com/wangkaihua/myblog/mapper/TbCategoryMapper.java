package com.wangkaihua.myblog.mapper;

import com.wangkaihua.myblog.entity.TbCategory;
import com.wangkaihua.myblog.entity.TbCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCategoryMapper {
    long countByExample(TbCategoryExample example);

    int deleteByExample(TbCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbCategory record);

    int insertSelective(TbCategory record);

    List<TbCategory> selectByExample(TbCategoryExample example);

    TbCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbCategory record, @Param("example") TbCategoryExample example);

    int updateByExample(@Param("record") TbCategory record, @Param("example") TbCategoryExample example);

    int updateByPrimaryKeySelective(TbCategory record);

    int updateByPrimaryKey(TbCategory record);
}