package com.example.aopmethodwarn.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class DeprecatedLog {

    @Before("execution(* com.example.demoproject.*.*(..)) && @annotation(Deprecated))")
    public void logDeprecated(JoinPoint joinPoint) throws Throwable {
        System.out.println("deprecated method: " + joinPoint.getSignature().getName());
    }
}
