package com.yukon_wm.exception;

import lombok.Data;

@Data
public class Result {
    private Boolean success;
    private Integer code;
    private String message;
    private Object data = null;

    // 构造私有
    private Result(){}

    /*---------------------------------------状态设置-----------------------------------------*/
    /*默认的三种响应状态*/
    public static Result ok(){// 后端处理中未发生异常，响应成功处理
        Result result = new Result();
        result.setSuccess(ResultCode.SUCCESS.getSuccess());
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setMessage(ResultCode.SUCCESS.getMessage());
        return result;
    }
    public static Result no(){// 后端处理中未发生异常，响应未成功处理
        Result result = new Result();
        result.setSuccess(ResultCode.ERROR.getSuccess());
        result.setCode(ResultCode.ERROR.getCode());
        result.setMessage(ResultCode.ERROR.getMessage());
        return result;
    }
    public static Result error(){// 后端处理中发生未知异常
        Result result = new Result();
        result.setSuccess(ResultCode.ERROR.getSuccess());
        result.setCode(ResultCode.ERROR.getCode());
        result.setMessage(ResultCode.SUCCESS.getMessage());
        return result;
    }
    /*自定义的响应状态*/
    public static Result state(ResultCode resultCode){
        Result result = new Result();
        result.setSuccess(resultCode.getSuccess());
        result.setCode(resultCode.getCode());
        result.setMessage(resultCode.getMessage());
        return result;
    }

    /*-------------------------------------------data 结点设置-------------------------------------------*/
    public Result data(Object data){
        this.data=data;
        return this;
    }
}
