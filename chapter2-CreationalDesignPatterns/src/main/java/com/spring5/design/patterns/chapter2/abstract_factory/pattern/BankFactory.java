package com.spring5.design.patterns.chapter2.abstract_factory.pattern;

import com.spring5.design.patterns.chapter2.model.*;

public class BankFactory extends AbstractFactory {

    @Override
    Bank getBank(BankName bankName) {
        if(bankName == BankName.ICICI) {
            return new ICICIBank();
        } else if(bankName == BankName.YES) {
            return new YesBank();
        }

        return null;
    }

    @Override
    Account getAccount(AccountType accountType) {
        return null;
    }

}
