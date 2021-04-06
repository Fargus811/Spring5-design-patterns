package com.spring5.design.patterns.chapter2.factory.pattern;

import com.spring5.design.patterns.chapter2.model.Account;
import com.spring5.design.patterns.chapter2.model.AccountType;
import com.spring5.design.patterns.chapter2.model.CurrentAccount;
import com.spring5.design.patterns.chapter2.model.SavingAccount;

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
