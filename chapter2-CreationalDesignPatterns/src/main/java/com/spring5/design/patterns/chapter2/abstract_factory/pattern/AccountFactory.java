package com.spring5.design.patterns.chapter2.abstract_factory.pattern;

import com.spring5.design.patterns.chapter2.model.*;

public class AccountFactory extends AbstractFactory {

    @Override
    Bank getBank(BankName bankName) {
        return null;
    }

    @Override
    Account getAccount(AccountType accountType) {
        if(accountType == AccountType.CURRENT) {
            return new CurrentAccount();
        } else if(accountType == AccountType.SAVING) {
            return new SavingAccount();
        }
        return null;
    }

}
