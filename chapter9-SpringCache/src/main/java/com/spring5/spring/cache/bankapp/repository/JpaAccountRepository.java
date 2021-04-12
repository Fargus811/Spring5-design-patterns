package com.spring5.spring.cache.bankapp.repository;

import com.spring5.spring.cache.bankapp.model.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JpaAccountRepository implements AccountRepository {

    @Override
    public Account findAccountById(Long id) {
        return new Account(id);
    }

    @Override
    public List<Account> findAll() {
        return null;
    }

    @Override
    public Long save(Account account) {
        return null;
    }

    @Override
    public Double checkAccountBalance(Account account) {
        return null;
    }
}