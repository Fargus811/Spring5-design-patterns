package com.spring5.spring.cache.bankapp.service;

import com.spring5.spring.cache.bankapp.model.Account;

public interface AccountService {

    Account findOne(Long id);

    Long save(Account account);

    void remove(Long id);
}
