package com.as.AMB.util;

public class RestUtil {

    public static Response Ok() {
        return new Response(ResponseCode.Ok, "", null);
    }
    public static Response Ok(Object object) {
        return new Response(ResponseCode.Ok, "", object);
    }

    public static Response Ok(String msg, Object object) {
        return new Response(ResponseCode.Ok, msg, object);
    }

    public static Response Error(String msg) {
        return new Response(ResponseCode.Error, msg, null);
    }

    public static Response Error(String msg, Object object) {
        return new Response(ResponseCode.Error, msg, object);
    }

    public static Response Error(String code, String msg, Object object) {
        return new Response(code, msg, object);
    }
}
