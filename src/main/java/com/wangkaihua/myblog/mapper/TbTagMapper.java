package com.wangkaihua.myblog.mapper;

import com.wangkaihua.myblog.entity.TbTag;
import com.wangkaihua.myblog.entity.TbTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTagMapper {
    long countByExample(TbTagExample example);

    int deleteByExample(TbTagExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbTag record);

    int insertSelective(TbTag record);

    List<TbTag> selectByExample(TbTagExample example);

    TbTag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbTag record, @Param("example") TbTagExample example);

    int updateByExample(@Param("record") TbTag record, @Param("example") TbTagExample example);

    int updateByPrimaryKeySelective(TbTag record);

    int updateByPrimaryKey(TbTag record);
}