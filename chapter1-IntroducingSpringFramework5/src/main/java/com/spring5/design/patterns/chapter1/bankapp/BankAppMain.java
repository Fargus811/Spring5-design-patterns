package com.spring5.design.patterns.chapter1.bankapp;

import com.spring5.design.patterns.chapter1.bankapp.config.AppConfig;
import com.spring5.design.patterns.chapter1.bankapp.model.Amount;
import com.spring5.design.patterns.chapter1.bankapp.service.TransferService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankAppMain {

    private static final Log logger = LogFactory.getLog(BankAppMain.class);

    public static void main(String[] args) {
        //Load Spring context
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        logger.info("Spring context loaded successfully");
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory beanFactory = applicationContext.getBeanFactory();
        //Use transfer method
        TransferService transferService = applicationContext.getBean(TransferService.class);
        transferService.transferAmount(100L, 200L, Amount.builder().balance(2000.0).build());

        //Close Spring context
        applicationContext.close();
        logger.info("Spring context closed successfully");
    }
}
