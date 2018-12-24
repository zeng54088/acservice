package com.tree.acservice.common.entity;

/**
 * Created by Administrator on 2018/12/23.
 */
public class BaseVo {

    private Boolean success=true;

    private Object data;

    private String msg="";

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
