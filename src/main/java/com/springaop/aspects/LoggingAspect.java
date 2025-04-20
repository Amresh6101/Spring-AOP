package com.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;

@Aspect
@Component
public class LoggingAspect {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Pointcut("execution(* com.springaop.service.*.*(..))")
    public void allServiceMethods() {
    }

    @Before("allServiceMethods()")
    public void logBeforeAllMethods(JoinPoint joinPoint){
        logger.debug("***LoggingAspect.logBeforeAllMethods(): " + joinPoint.getSignature().getName());
    }
    @Before("allServiceMethods()")
    public void logBeforeGetEmployee(JoinPoint joinPoint) {
        logger.debug("****LoggingAspect.logBeforeGetEmployee() : " + joinPoint.getSignature().getName());
    }
    @Before("allServiceMethods()")
    public void logBeforeAddEmployee(JoinPoint joinPoint) {
        logger.debug("****LoggingAspect.logBeforeAddEmployee() : " + joinPoint.getSignature().getName());
    }
    @After("allServiceMethods()")
    public void logAfterAllEmployee(JoinPoint joinPoint) {
        logger.debug("****LoggingAspect.logAfterAllEmployee() : " + joinPoint.getSignature().getName());
    }
    @After("allServiceMethods()")
    public void logAfterGetEmployee(JoinPoint joinPoint) {
        logger.debug("****LoggingAspect.logAfterGetEmployee() : " + joinPoint.getSignature().getName());
    }
    @After("allServiceMethods()")
    public void logAfterAddEmployee(JoinPoint joinPoint) {
        logger.debug("****LoggingAspect.logAfterAddEmployee() : " + joinPoint.getSignature().getName());
    }
    // instead of using before and after we can use around also.
    // all method are advices which give info what we have to perform

}
