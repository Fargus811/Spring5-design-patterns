package com.spring5.design.patterns.chapter1.bankapp.service.impl;

import com.spring5.design.patterns.chapter1.bankapp.model.Account;
import com.spring5.design.patterns.chapter1.bankapp.model.Amount;
import com.spring5.design.patterns.chapter1.bankapp.repository.AccountRepository;
import com.spring5.design.patterns.chapter1.bankapp.repository.TransferRepository;
import com.spring5.design.patterns.chapter1.bankapp.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;

public class TransferServiceImpl implements TransferService {

    private final AccountRepository accountRepository;
    private final TransferRepository transferRepository;

    @Autowired
    public TransferServiceImpl(AccountRepository accountRepository, TransferRepository transferRepository) {
        this.accountRepository = accountRepository;
        this.transferRepository = transferRepository;
    }

    @Override
    public void transferAmount(Long a, Long b, Amount amount) {
        Account accountA = accountRepository.findByAccountId(a);
        Account accountB = accountRepository.findByAccountId(b);
        transferRepository.transfer(accountA, accountB, amount);
    }

}
