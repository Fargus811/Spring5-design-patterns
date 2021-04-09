package com.spring5.aop.annotation.bankapp;

import com.spring5.aop.annotation.bankapp.config.AppConfig;
import com.spring5.aop.annotation.bankapp.service.TransferService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AspectDemo {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        TransferService transferService = applicationContext.getBean(TransferService.class);
        transferService.transfer("accountA", "accountB", 50000l);
        applicationContext.close();
    }
}
