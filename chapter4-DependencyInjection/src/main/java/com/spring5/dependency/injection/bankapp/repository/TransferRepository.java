package com.spring5.dependency.injection.bankapp.repository;

import com.spring5.dependency.injection.bankapp.model.Account;
import com.spring5.dependency.injection.bankapp.model.Amount;

public interface TransferRepository {

    void transfer(Account accountA, Account accountB, Amount amount);
}
