package com.yukon_wm.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.text.SimpleDateFormat;
import java.util.Date;


public enum ResultCode {
    SUCCESS(true, 2000, "成功"),
    ERROR(false, 2001, "未知错误 "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())),
    PARAM_ERROR(false, 2002, "参数错误 "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())),
    NULLPOINTER(false, 2003, "空指向异常 "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())),
    NULLUSERNAME(false,2005,"用户名不存在"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())),
    ERROR_PWD(false,2006,"密码错误"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));

    // 是否成功
    private Boolean success;
    // 响应编码
    private Integer code;
    // 响应消息
    private String message;

    ResultCode(Boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
