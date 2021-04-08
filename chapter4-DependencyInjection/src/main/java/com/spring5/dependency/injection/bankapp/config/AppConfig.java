package com.spring5.dependency.injection.bankapp.config;

import com.spring5.dependency.injection.bankapp.repository.AccountRepository;
import com.spring5.dependency.injection.bankapp.repository.TransferRepository;
import com.spring5.dependency.injection.bankapp.repository.impl.JdbcAccountRepository;
import com.spring5.dependency.injection.bankapp.repository.impl.JdbcTransferRepository;
import com.spring5.dependency.injection.bankapp.service.TransferService;
import com.spring5.dependency.injection.bankapp.service.TransferServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses={TransferService.class,AccountRepository.class})
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
        return new JdbcTransferRepository();
    }
}
