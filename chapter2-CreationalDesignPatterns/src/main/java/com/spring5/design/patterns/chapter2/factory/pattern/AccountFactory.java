package com.spring5.design.patterns.chapter2.factory.pattern;

import com.spring5.design.patterns.chapter2.adapter.pattern.model.Account;
import com.spring5.design.patterns.chapter2.adapter.pattern.model.AccountType;
import com.spring5.design.patterns.chapter2.adapter.pattern.model.CurrentAccount;
import com.spring5.design.patterns.chapter2.adapter.pattern.model.SavingAccount;

public class AccountFactory {

    public Account getAccount(AccountType type) {
        if(type == AccountType.CURRENT) {
            return new CurrentAccount();
        } else if(type == AccountType.SAVING) {
            return new SavingAccount();
        }

        return null;
    }

}
