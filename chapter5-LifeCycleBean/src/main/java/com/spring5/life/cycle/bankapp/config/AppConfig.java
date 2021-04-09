package com.spring5.life.cycle.bankapp.config;

import com.spring5.life.cycle.bankapp.repository.AccountRepository;
import com.spring5.life.cycle.bankapp.repository.JdbcAccountRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring5.life.cycle.bankapp")
public class AppConfig {

    @Bean
    public AccountRepository accountRepository(){
        return new JdbcAccountRepository();
    }
}
