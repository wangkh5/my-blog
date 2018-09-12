package com.wangkaihua.myblog.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class TbBlogTag implements Serializable {
    private Integer id;

    private Integer tagId;

    private Integer blogId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }
}