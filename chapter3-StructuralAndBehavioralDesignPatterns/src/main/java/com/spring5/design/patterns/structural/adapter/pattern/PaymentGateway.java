package com.spring5.design.patterns.structural.adapter.pattern;

import com.spring5.design.patterns.structural.adapter.pattern.model.Account;

public interface PaymentGateway {

    void doPayment(Account account1, Account account2);
}