package com.zzz.core.advice;

import com.zzz.core.bean.ResultBean;
import com.zzz.core.enums.ResponseStatus;
import com.zzz.core.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.net.BindException;

/**
 * 通用的异常处理器
 */
@Slf4j
@RestControllerAdvice(basePackages = "com.zzz.com.ccc.controller")
public class CommonExceptionHandler {

    /**
     * 处理后台数据校验异常
     * */
    @ExceptionHandler(BindException.class)
    public ResultBean handlerBindException(BindException e){
        log.error(e.getMessage(),e);
        return ResultBean.fail(ResponseStatus.PARAM_ERROR);
    }

    /**
     * 处理业务异常
     * */
    @ExceptionHandler(BusinessException.class)
    public ResultBean handlerBusinessException(BusinessException e){
        log.error(e.getMessage(),e);
        return ResultBean.fail(e.getResStatus());
    }


    /**
     * 处理系统异常
     * */
    @ExceptionHandler(Exception.class)
    public ResultBean handlerException(Exception e){
        log.error(e.getMessage(),e);
        return ResultBean.error();
    }
}
