package com.spring5.design.patterns.chapter1.bankapp.aspect;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    private static final Log logger = LogFactory.getLog(LoggingAspect.class);

    @Before("execution(* *.transferAmount(..))")
    public void logBeforeTransfer(){
        logger.info("####LoggingAspect.logBeforeTransfer() method called before transfer amount####");
    }

    @After("execution(* *.transferAmount(..))")
    public void logAfterTransfer(){
        logger.info("####LoggingAspect.logAfterTransfer() method called after transfer amount####");
    }

}
