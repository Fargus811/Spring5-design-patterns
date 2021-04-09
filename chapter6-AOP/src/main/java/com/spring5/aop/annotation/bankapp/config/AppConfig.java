package com.spring5.aop.annotation.bankapp.config;

import com.spring5.aop.annotation.bankapp.aspect.Auditing;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages={"com.spring5.aop.annotation.bankapp.service"})
public class AppConfig {

    @Bean
    public Auditing auditing() {
        return new Auditing();
    }
}
