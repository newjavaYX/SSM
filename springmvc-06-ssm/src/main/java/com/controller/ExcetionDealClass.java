package com.controller;

import com.exception.BusinessException;
import com.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExcetionDealClass {
    @ExceptionHandler(SystemException.class)
    public Result dealSystemException(SystemException ex){
        System.out.println("SystemException.....");
        return new Result(ex.getCode(),ex.getCause(),ex.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result dealBusinessException(BusinessException ex){
        System.out.println(".....");
        return new Result(ex.getCode(),ex.getCause(),ex.getMessage());
    }
}
