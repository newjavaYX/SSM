package com.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExcetionDealClass {
    @ExceptionHandler(Exception.class)
    public Result AllExcetionsDeal(Exception ex){
        System.out.println(".....");
        return new Result(500,null,"低调...");
    }
}
