package com.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author：linma
 * @date: 2018/11/29 9:57
 * @email: linma@homeinns.com
 **/
@Aspect
@Component
public class ServiceAop {

    @Pointcut("execution(public * com.services.impl.*.*(..))")
    private void services() { }

    @Before("services()")
    public void methodBefore() {

    }

}