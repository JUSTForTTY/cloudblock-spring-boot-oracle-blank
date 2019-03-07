package com.company.project.core.result;

import java.util.List;
import java.util.Map;

/**
 * 响应结果生成工具
 */
public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

    public static Result genSuccessResult(Map<String,String> param) {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setParam(param);
    }

    public static Result genSuccessResult(Object data,Map<String,String> param) {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setParam(param)
                .setData(data);
        		 
    }

    public static Result genFailResult(String message,Map<String,String> param) {
        return new Result()
                .setCode(ResultCode.FAIL)
                .setMessage(message)
        		.setParam(param);
    }
    
    public static Result genUnauthorizedResult(Map<String,String> param) {
        return new Result()
                .setCode(ResultCode.UNAUTHORIZED)
                .setMessage(ResultCode.UNAUTHORIZED.getMessage())
        		.setParam(param);
    }
    public static Result genNotFoundResult(Map<String,String> param) {
        return new Result()
                .setCode(ResultCode.NOT_FOUND)
                .setMessage(ResultCode.NOT_FOUND.getMessage())
                .setParam(param);
    }
    public static Result genServerErrorResult(Map<String,String> param) {
        return new Result()
                .setCode(ResultCode.INTERNAL_SERVER_ERROR)
                .setMessage(ResultCode.INTERNAL_SERVER_ERROR.getMessage())
                .setParam(param);
    }
    public static Result genInvalidParamResult(Map<String,String> param) {
        return new Result()
                .setCode(ResultCode.INVALID_PARAM)
                .setMessage(ResultCode.INVALID_PARAM.getMessage())
                .setParam(param);
    }
    
    
}
