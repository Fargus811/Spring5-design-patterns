package com.spring5.spring.cache.bankapp.service;

import com.spring5.spring.cache.bankapp.model.Account;
import com.spring5.spring.cache.bankapp.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    AccountRepository accountRepository;

    @Override
    @Cacheable("accountCache")
    public Account findOne(Long id) {
        System.out.println("findOne called");
        return accountRepository.findAccountById(id);
    }

    @Override
    @CachePut("accountCache")
    public Long save(Account account) {
        return accountRepository.save(account);
    }

    @Override
    @CacheEvict("accountCache")
    public void remove(Long id) {
        accountRepository.findAccountById(id);
    }
}
