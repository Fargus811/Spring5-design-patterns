package com.spring5.dependency.injection.bankapp.repository.impl;

import com.spring5.dependency.injection.bankapp.model.Account;
import com.spring5.dependency.injection.bankapp.model.Amount;
import com.spring5.dependency.injection.bankapp.repository.AccountRepository;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcAccountRepository implements AccountRepository {

    @Override
    public Account findByAccountId(Long accountId) {
        return new Account(accountId, "Arnav Rajput", new Amount(3000.0));
    }
}