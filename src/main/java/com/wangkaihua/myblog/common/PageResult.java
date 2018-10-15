package com.wangkaihua.myblog.common;

import com.wangkaihua.myblog.entity.TbBlogWithBLOBs;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangkaihua
 * @create 2018-09-06 15:27
 **/
public class PageResult implements Serializable{
    private long totalRecord;
    private List<TbBlogWithBLOBs> rows;

    public PageResult(long totalRecord, List<TbBlogWithBLOBs> rows) {
        this.totalRecord = totalRecord;
        this.rows = rows;
    }

    public long getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(long totalRecord) {
        this.totalRecord = totalRecord;
    }

    public List<TbBlogWithBLOBs> getRows() {
        return rows;
    }

    public void setRows(List<TbBlogWithBLOBs> rows) {
        this.rows = rows;
    }
}
