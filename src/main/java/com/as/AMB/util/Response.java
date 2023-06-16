package com.as.AMB.util;

public class Response {
    public String code;
    public String msg;
    public Object data;

    public Response(String ok, String s, Object object) {
        this.code=ok;
        this.msg=s;
        this.data=object;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Response{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data.toString() +
                '}';
    }
}
