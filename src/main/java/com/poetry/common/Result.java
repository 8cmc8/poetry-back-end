package com.poetry.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: Result <br/>
 * Description: <br/>
 * date: 2019-04-28 21:57<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@ApiModel("返回结果通用类Result")
public class Result<T> {
    @ApiModelProperty("是否成功")
    private boolean success = false;
    @ApiModelProperty("具体数据")
    private T data = null;
    @ApiModelProperty("返回信息")
    private String msg = "";
    @ApiModelProperty("结果状态码")
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

    public static <T> Result<T> fail() {
        return fail("100", "未知错误，请联系管理员");
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
