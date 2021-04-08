package com.spring5.factory.bean.bankapp.service;

import com.spring5.factory.bean.bankapp.repository.IAccountRepository;

public class TransferService {

    IAccountRepository accountRepository;

    public TransferService(IAccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }
    public void transfer(String accountA, String accountB, Double amount){
        System.out.println("Amount has been tranferred");
    }
}