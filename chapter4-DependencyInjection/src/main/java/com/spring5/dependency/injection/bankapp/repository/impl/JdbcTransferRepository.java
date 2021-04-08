package com.spring5.dependency.injection.bankapp.repository.impl;

import com.spring5.dependency.injection.bankapp.model.Account;
import com.spring5.dependency.injection.bankapp.model.Amount;
import com.spring5.dependency.injection.bankapp.repository.TransferRepository;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcTransferRepository implements TransferRepository {

    @Override
    public void transfer(Account accountA, Account accountB, Amount amount) {
        System.out.println("Transfering amount from account A to B via JDBC implementation");
    }
}
