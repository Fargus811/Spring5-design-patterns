package com.spring5.design.patterns.chapter1.bankapp.config;

import com.spring5.design.patterns.chapter1.bankapp.aspect.LoggingAspect;
import com.spring5.design.patterns.chapter1.bankapp.repository.AccountRepository;
import com.spring5.design.patterns.chapter1.bankapp.repository.TransferRepository;
import com.spring5.design.patterns.chapter1.bankapp.repository.jdbc.JdbcAccountRepository;
import com.spring5.design.patterns.chapter1.bankapp.repository.jpa.JpaTransferRepository;
import com.spring5.design.patterns.chapter1.bankapp.service.TransferService;
import com.spring5.design.patterns.chapter1.bankapp.service.impl.TransferServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public TransferService transferService(){
        return new TransferServiceImpl(accountRepository(), transferRepository());
    }

    @Bean
    public AccountRepository accountRepository() {
        return new JdbcAccountRepository();
    }

    @Bean
    public TransferRepository transferRepository() {
        return new JpaTransferRepository();
    }

    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }

}
