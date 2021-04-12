package com.spring5.spring.cache.bankapp;

import com.spring5.spring.cache.bankapp.config.AppConfig;
import com.spring5.spring.cache.bankapp.model.Account;
import com.spring5.spring.cache.bankapp.service.AccountService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringCacheDemo {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        AccountService transferService = applicationContext.getBean(AccountService.class);
        Account account = transferService.findOne(1L);
        System.out.println(account);
        account = transferService.findOne(1L);
        System.out.println(account);
        applicationContext.close();
    }
}
