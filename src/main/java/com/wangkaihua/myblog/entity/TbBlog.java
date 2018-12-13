package com.wangkaihua.myblog.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class TbBlog implements Serializable {
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 分类id
     */
    private Integer categoryId;

    private Date createTime;

    private Date updateTime;

    /**
     * 浏览量
     */
    private Integer hits;

    /**
     * markdown内容
     */
    private String content;

    /**
     * 摘要
     */
    private String digest;

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}