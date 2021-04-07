package com.spring5.design.patterns.structural.decorator.impl;

import com.spring5.design.patterns.structural.decorator.Account;

public class CurrentAccount implements Account {

    @Override
    public String getTotalBenefits() {
        return "There is no withdrwal limit for current account";
    }
}
