package com.wangkaihua.myblog.common;

import java.io.Serializable;

/**
 * @author wangkaihua
 * @create 2018-09-04 17:26
 **/
public class Result implements Serializable{
    private boolean success;
    private String message;

    public Result(boolean success, String message) {
        super();
        this.success = success;
        this.message = message;
    }

    public static Result successResult(){
        return new Result(true,"操作成功");
    }

    public static Result failResult(){
        return new Result(false,"操作失败");
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

