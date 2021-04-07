package com.spring5.design.patterns.chapter2.factory.pattern;

import com.spring5.design.patterns.chapter2.adapter.pattern.model.Account;
import com.spring5.design.patterns.chapter2.adapter.pattern.model.AccountType;

public class FactoryPatternMain {

    public static void main(String[] args) {
        AccountFactory accountFactory = new AccountFactory();

        //get an object of SavingAccount and call its accountType() method.
        Account savingAccount = accountFactory.getAccount(AccountType.SAVING);

        //call accountType method of SavingAccount
        savingAccount.accountType();

        //get an object of CurrentAccount and call its accountType() method.
        Account currentAccount = accountFactory.getAccount(AccountType.CURRENT);

        //call accountType method of CurrentAccount
        currentAccount.accountType();
    }

}
