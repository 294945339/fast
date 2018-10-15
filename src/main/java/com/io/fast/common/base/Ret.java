package com.io.fast.common.base;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: dj
 * @Date: 2018\10\15 0015 11:27
 * @Description:
 */

public class Ret extends HashMap<String, Object> implements Serializable {
    private static final long serialVersionUID = 1L;

    public Ret() {
        put("code", 0);
    }

    public static Ret error() {
        return error(HttpStatus.INTERNAL_SERVER_ERROR.code(), "未知异常，请联系管理员");
    }

    public static Ret error(String msg) {
        return error(HttpStatus.INTERNAL_SERVER_ERROR.code(), msg);
    }

    public static Ret error(int code, String msg) {
        Ret r = new Ret();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static Ret ok(String msg) {
        Ret r = new Ret();
        r.put("msg", msg);
        return r;
    }

    public static Ret ok(Map<String, Object> map) {
        Ret r = new Ret();
        r.putAll(map);
        return r;
    }

    public static Ret ok() {
        return new Ret();
    }

    @Override
    public Ret put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
