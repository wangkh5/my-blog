package com.wangkaihua.myblog.mapper;

import com.wangkaihua.myblog.entity.TbBlog;
import com.wangkaihua.myblog.entity.TbBlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbBlogMapper {
    long countByExample(TbBlogExample example);

    int deleteByExample(TbBlogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbBlog record);

    int insertSelective(TbBlog record);

    List<TbBlog> selectByExampleWithBLOBs(TbBlogExample example);

    List<TbBlog> selectByExample(TbBlogExample example);

    TbBlog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbBlog record, @Param("example") TbBlogExample example);

    int updateByExampleWithBLOBs(@Param("record") TbBlog record, @Param("example") TbBlogExample example);

    int updateByExample(@Param("record") TbBlog record, @Param("example") TbBlogExample example);

    int updateByPrimaryKeySelective(TbBlog record);

    int updateByPrimaryKeyWithBLOBs(TbBlog record);

    int updateByPrimaryKey(TbBlog record);
}