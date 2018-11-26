package com.wangkaihua.myblog.entity.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author wangkaihua
 * @create 2018-11-26 12:39
 **/
public class BlogVO implements Serializable{
    private static final long serialVersionUID = -8052840205331132737L;

    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 分类id
     */
    private Integer categoryId;

    /**
     * 浏览量
     */
    private Integer hits;

    /**
     * markdown内容
     */
    private String content;

    private Date createTime;

    private Date updateTime;

    /**
     * 标签
     */
    private List<Integer> tags;

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

    public List<Integer> getTags() {
        return tags;
    }

    public void setTags(List<Integer> tags) {
        this.tags = tags;
    }
}
