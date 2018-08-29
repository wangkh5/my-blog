package com.wangkaihua.myblog.mapper;

import com.wangkaihua.myblog.entity.TbMe;
import com.wangkaihua.myblog.entity.TbMeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbMeMapper {
    long countByExample(TbMeExample example);

    int deleteByExample(TbMeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbMe record);

    int insertSelective(TbMe record);

    List<TbMe> selectByExample(TbMeExample example);

    TbMe selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbMe record, @Param("example") TbMeExample example);

    int updateByExample(@Param("record") TbMe record, @Param("example") TbMeExample example);

    int updateByPrimaryKeySelective(TbMe record);

    int updateByPrimaryKey(TbMe record);
}