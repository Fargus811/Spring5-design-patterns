package com.spring5.factory.bean.bankapp.config;

import com.spring5.factory.bean.bankapp.repository.AccountRepositoryFactoryBean;
import com.spring5.factory.bean.bankapp.service.TransferService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public TransferService transferService() throws Exception{
        return new TransferService(accountRepository().getObject());
    }
    @Bean
    public AccountRepositoryFactoryBean accountRepository(){
        return new AccountRepositoryFactoryBean();
    }
}