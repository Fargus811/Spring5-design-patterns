package com.spring5.spring.cache.bankapp.repository;

import com.spring5.spring.cache.bankapp.model.Account;

import java.util.List;

public interface AccountRepository {

    Account findAccountById(Long id);

    List<Account> findAll();

    Long save(Account account);

    Double checkAccountBalance(Account account);
}
