package com.wangkaihua.myblog.mapper;

import com.wangkaihua.myblog.entity.TbBlogTag;
import com.wangkaihua.myblog.entity.TbBlogTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbBlogTagMapper {
    long countByExample(TbBlogTagExample example);

    int deleteByExample(TbBlogTagExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbBlogTag record);

    int insertSelective(TbBlogTag record);

    List<TbBlogTag> selectByExample(TbBlogTagExample example);

    TbBlogTag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbBlogTag record, @Param("example") TbBlogTagExample example);

    int updateByExample(@Param("record") TbBlogTag record, @Param("example") TbBlogTagExample example);

    int updateByPrimaryKeySelective(TbBlogTag record);

    int updateByPrimaryKey(TbBlogTag record);
}