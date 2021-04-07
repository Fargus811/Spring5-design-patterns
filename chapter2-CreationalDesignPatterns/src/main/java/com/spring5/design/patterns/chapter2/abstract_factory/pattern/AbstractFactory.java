package com.spring5.design.patterns.chapter2.abstract_factory.pattern;

import com.spring5.design.patterns.chapter2.adapter.pattern.model.Account;
import com.spring5.design.patterns.chapter2.adapter.pattern.model.AccountType;
import com.spring5.design.patterns.chapter2.adapter.pattern.model.Bank;
import com.spring5.design.patterns.chapter2.adapter.pattern.model.BankName;

public abstract class AbstractFactory {

    abstract Bank getBank(BankName bankName);
    abstract Account getAccount(AccountType accountType);

}
