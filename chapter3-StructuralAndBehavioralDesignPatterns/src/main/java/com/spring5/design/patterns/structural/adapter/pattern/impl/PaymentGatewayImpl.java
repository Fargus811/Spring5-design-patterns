package com.spring5.design.patterns.structural.adapter.pattern.impl;

import com.spring5.design.patterns.structural.adapter.pattern.PaymentGateway;
import com.spring5.design.patterns.structural.adapter.pattern.model.Account;

public class PaymentGatewayImpl implements PaymentGateway {

    @Override
    public void doPayment(Account account1, Account account2){
        System.out.println("Do payment using Payment Gateway");
    }

}