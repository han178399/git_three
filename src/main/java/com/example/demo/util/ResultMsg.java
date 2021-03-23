package com.example.demo.util;

public class ResultMsg {
    private int code;
    private Object data;
    private String msg;

    public int getCode() {
        return code;
    }

    public Object getData() {
        return data;
    }

    public String getMsg() {
        return msg;
    }

    public ResultMsg(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }
    public static ResultMsg create(int code, Object data, String msg){
        return new ResultMsg(code, data,msg);
    }
    public static ResultMsg create(int code, Object data){
        return new ResultMsg(code, data,null);
    }
    public static ResultMsg create(int code){
        return new ResultMsg(code, null,null);
    }
    public static ResultMsg ok(){
        return new ResultMsg(SUCCESS, null,null);
    }

    public static int SUCCESS = 1000;
    public static int ERROR = 1001;
    public static int NO_API_ERROR = 1002;
}
