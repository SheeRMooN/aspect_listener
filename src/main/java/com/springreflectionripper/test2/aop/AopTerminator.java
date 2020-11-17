package com.springreflectionripper.test2.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopTerminator {

    @After("execution(* com.springreflectionripper.test2.aop.Terminator.getMessagePrint(..))")
    public void testAop(JoinPoint joinPoint){
        System.out.println("Aop After " + joinPoint.getSignature().getName());
    }
    @Around("execution(* com.springreflectionripper.test2.aop.Terminator.getMessagePrint(..))")
    public void ttew(ProceedingJoinPoint joinPoint){
        System.out.println("hello proceed");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @Before("execution(* com.springreflectionripper.test2.aop.Terminator.getMessagePrint())")
    public void testAopBefore(JoinPoint joinPoint){
        System.out.println("Aop Before " + joinPoint.getSignature().getName());
    }
}
