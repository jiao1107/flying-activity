package com.flying.activity.handler;

import com.flying.common.constants.DataResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

/**
 * 异常处理
 *
 * @author Feixiang.Jiao
 * @date 2022-08-22 14:35
 * @since 1.0
 */
@RestControllerAdvice
public class ControllerExceptionHandler {

    private static Logger logger = LoggerFactory.getLogger(ControllerExceptionHandler.class);


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public DataResult handleValidException(MethodArgumentNotValidException e) {
        StringBuilder sBuilder = new StringBuilder();
        List<ObjectError> allErrors = e.getBindingResult().getAllErrors();
        for (ObjectError error : allErrors) {
            sBuilder.append(error.getDefaultMessage()).append(";");
        }
        logger.error("----------->>> valid exception ", e);
        return DataResult.success(sBuilder.toString());
    }

    @ExceptionHandler(Exception.class)
    public DataResult handleException(Exception e) {
        logger.error("----------->>> exception ", e);
        return DataResult.success();
    }

}
