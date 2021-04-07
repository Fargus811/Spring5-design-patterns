package com.spring5.design.patterns.structural.composite.pattern.impl;

import com.spring5.design.patterns.structural.composite.pattern.Account;

public class CurrentAccount implements Account {

    @Override
    public void accountType() {
        System.out.println("CURRENT ACCOUNT");
    }
}
