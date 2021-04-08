package com.spring5.dependency.injection.bankapp;

import com.spring5.dependency.injection.bankapp.config.AppConfig;
import com.spring5.dependency.injection.bankapp.model.Amount;
import com.spring5.dependency.injection.bankapp.service.TransferService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TransferMain {

    public static void main(String[] args) {
        //Load Spring context
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        //Get TransferService bean
        TransferService transferService = applicationContext.getBean(TransferService.class);
        //Use transfer method
        transferService.transferAmount(100l, 200l, new Amount(2000.0));
        applicationContext.close();
    }
}
