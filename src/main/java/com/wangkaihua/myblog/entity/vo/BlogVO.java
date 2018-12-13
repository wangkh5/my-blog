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
     * 分类名称
     */
    private String categoryName;

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

    private Date createTime;

    private Date updateTime;

    /**
     * 标签
     */
    private List<Integer> tagIdList;

    /**
     * 标签名称
     */
    private List<String> tagNameList;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getTagNameList() {
        StringBuilder result = new StringBuilder();
        for (String tagName : tagNameList){
            result.append(tagName);
            result.append("、");
        }
        return result.toString().substring(0,result.length()-1);
    }

    public void setTagNameList(List<String> tagNameList) {
        this.tagNameList = tagNameList;
    }

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

    public List<Integer> getTagIdList() {
        return tagIdList;
    }

    public void setTagIdList(List<Integer> tagIdList) {
        this.tagIdList = tagIdList;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }
}
