package com.spring5.factory.bean.bankapp.repository;

import org.springframework.beans.factory.FactoryBean;

public class AccountRepositoryFactoryBean implements FactoryBean<IAccountRepository> {

    @Override
    public IAccountRepository getObject() throws Exception {
        return new AccountRepository();
    }
    @Override
    public Class<?> getObjectType() {
        return IAccountRepository.class;
    }
    @Override
    public boolean isSingleton() {
        return false;
    }
}
