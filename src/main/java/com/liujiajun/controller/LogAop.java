package com.liujiajun.controller;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component("logAop")
public class LogAop {

    public void doBefore(JoinPoint jp) throws NoSuchMethodException {
//        System.out.println("前置通知");
    }


    public void doAfter(JoinPoint jp) throws Exception {

//        System.out.println("后置通知");

    }
}
