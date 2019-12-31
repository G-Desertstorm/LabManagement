package com.lims.lab.pojo.entity;


import java.util.List;

public class Result<T> {

    private Integer code;
    private Boolean success;
    private String message;
    private List<T> data;


    public Result() {
    }

    public Result(Integer code, Boolean success, String message, List<T> data) {
        this.code = code;
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", success=" + success +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
