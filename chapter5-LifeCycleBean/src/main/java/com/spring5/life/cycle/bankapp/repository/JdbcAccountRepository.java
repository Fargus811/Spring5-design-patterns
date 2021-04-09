package com.spring5.life.cycle.bankapp.repository;

import com.spring5.life.cycle.bankapp.model.Account;
import com.spring5.life.cycle.bankapp.model.Amount;

import javax.annotation.PostConstruct;


public class JdbcAccountRepository implements AccountRepository{

    @Override
    public Account findByAccountId(Long accountId) {
        return new Account(accountId, "Arnav Rajput", new Amount(3000.0));
    }

    @PostConstruct
    void populateCache(){
        System.out.println("Called populateCache() method");
    }
}
