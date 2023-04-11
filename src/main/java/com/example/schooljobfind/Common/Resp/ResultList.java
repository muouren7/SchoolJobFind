package com.example.schooljobfind.Common.Resp;

import com.example.schooljobfind.Common.Emus.Em;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultList<T> implements Serializable {
    private int code;
    private String msg;
    private List<T> data;

    public ResultList(int code, String msg, List data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultList(Em e, List data){
        this.code = e.getCode();
        this.msg = e.getMsg();
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }
}
