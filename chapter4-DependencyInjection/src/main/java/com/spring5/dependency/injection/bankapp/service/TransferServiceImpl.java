package com.spring5.dependency.injection.bankapp.service;

import com.spring5.dependency.injection.bankapp.model.Account;
import com.spring5.dependency.injection.bankapp.model.Amount;
import com.spring5.dependency.injection.bankapp.repository.AccountRepository;
import com.spring5.dependency.injection.bankapp.repository.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TransferServiceImpl implements TransferService{

    @Autowired
    AccountRepository accountRepository;
    @Autowired
    TransferRepository transferRepository;

    public TransferServiceImpl() {
        super();
    }
    @Autowired
    public TransferServiceImpl(AccountRepository accountRepository, TransferRepository transferRepository) {
        super();
        this.accountRepository = accountRepository;
        this.transferRepository = transferRepository;
    }

    @Override
    public void transferAmount(Long a, Long b, Amount amount) {
        Account accountA = accountRepository.findByAccountId(a);
        Account accountB = accountRepository.findByAccountId(b);
        transferRepository.transfer(accountA, accountB, amount);
    }
    @Autowired(required = false)
    public void setAccountRepository(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    @Autowired
    public void setTransferRepository(TransferRepository transferRepository) {
        this.transferRepository = transferRepository;
    }
}
