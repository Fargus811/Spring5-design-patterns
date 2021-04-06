package com.spring5.design.patterns.chapter1.bankapp.repository;

import com.spring5.design.patterns.chapter1.bankapp.model.Account;
import com.spring5.design.patterns.chapter1.bankapp.model.Amount;

public interface TransferRepository {

    void transfer(Account accountA, Account accountB, Amount amount);

}
