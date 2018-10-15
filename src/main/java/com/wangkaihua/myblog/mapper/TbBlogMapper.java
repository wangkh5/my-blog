package com.wangkaihua.myblog.mapper;

import com.wangkaihua.myblog.entity.TbBlog;
import com.wangkaihua.myblog.entity.TbBlogExample;
import com.wangkaihua.myblog.entity.TbBlogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbBlogMapper {
    long countByExample(TbBlogExample example);

    int deleteByExample(TbBlogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbBlogWithBLOBs record);

    int insertSelective(TbBlogWithBLOBs record);

    List<TbBlogWithBLOBs> selectByExampleWithBLOBs(TbBlogExample example);

    List<TbBlog> selectByExample(TbBlogExample example);

    TbBlogWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbBlogWithBLOBs record, @Param("example") TbBlogExample example);

    int updateByExampleWithBLOBs(@Param("record") TbBlogWithBLOBs record, @Param("example") TbBlogExample example);

    int updateByExample(@Param("record") TbBlog record, @Param("example") TbBlogExample example);

    int updateByPrimaryKeySelective(TbBlogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbBlogWithBLOBs record);

    int updateByPrimaryKey(TbBlog record);
}