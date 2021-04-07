package com.spring5.design.patterns.structural.bridge.pattern.impl;

import com.spring5.design.patterns.structural.bridge.pattern.Account;

public class CurrentAccount implements Account {

    @Override
    public Account openAccount() {
        System.out.println("OPENED: CURRENT ACCOUNT ");
        return new CurrentAccount();
    }

    @Override
    public void accountType() {
        System.out.println("##It is a CURRENT Account##");
    }
}
