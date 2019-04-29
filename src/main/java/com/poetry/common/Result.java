package com.poetry.common;

/**
 * ClassName: Result <br/>
 * Description: <br/>
 * date: 2019-04-28 21:57<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public class Result<T> {
    private boolean success = false;
    private T data = null;
    private String msg = "";
    private String code = "500";

    public Result() {
    }

    public static <T> Result<T> success() {
        return success(null);
    }

    public static <T> Result<T> success(T data) {
        return success(data, "success");
    }

    public static <T> Result<T> success(T data, String msg) {
        Result<T> r = new Result<>();
        r.setData(data);
        r.setSuccess(true);
        r.setCode("200");
        r.setMsg(msg);
        return r;
    }

    public static <T> Result<T> fail(String msg) {
        return fail("500", msg);
    }

    public static <T> Result<T> fail(String code, String msg) {
        Result<T> r = new Result<>();
        r.setSuccess(false);
        r.setCode(code);
        r.setMsg(msg);
        return r;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public Result<T> setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public T getData() {
        return this.data;
    }

    public Result<T> setData(T data) {
        this.data = data;
        return this;
    }

    public String getMsg() {
        return this.msg;
    }

    public Result<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public Result<T> setCode(String code) {
        this.code = code;
        return this;
    }
}
