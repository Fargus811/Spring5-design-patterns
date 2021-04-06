package com.spring5.design.patterns.chapter2.abstract_factory.pattern;

import com.spring5.design.patterns.chapter2.model.Account;
import com.spring5.design.patterns.chapter2.model.AccountType;
import com.spring5.design.patterns.chapter2.model.Bank;
import com.spring5.design.patterns.chapter2.model.BankName;

public abstract class AbstractFactory {

    abstract Bank getBank(BankName bankName);
    abstract Account getAccount(AccountType accountType);

}
