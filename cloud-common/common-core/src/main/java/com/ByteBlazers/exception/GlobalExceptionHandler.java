package com.ByteBlazers.exception;

import com.ByteBlazers.entity.ResEntity;
import com.ByteBlazers.entity.RespEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 * @author zhangjk
 * @version 1.0
 * @date 2025/2/17 18:59
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    @ExceptionHandler(Exception.class)
    public ResEntity<Void> handleException(Exception e) {
        logger.info("globalExceptionHandler err:{}",e.toString());
        return ResEntity.error(RespEnum.SERVER_ERROR);
    }

}
