package com.spring5.design.patterns.chapter2.abstract_factory.pattern;

import com.spring5.design.patterns.chapter2.model.*;

public class AbstractFactoryPatternMain {

    @SuppressWarnings("all")
    public static void main(String[] args) {
        //get bank factory
        AbstractFactory bankFactory = FactoryProducer.getFactory(FactoryType.BANK);
        //get an object of BANK ICICI
        Bank iciciBank = bankFactory.getBank(BankName.ICICI);
        //call bankName method of Bank ICICI
        iciciBank.bankName();
        //get an object of BANK YES
        Bank yesBank = bankFactory.getBank(BankName.YES);
        //call bankName method of  Bank YES
        yesBank.bankName();

        //get account factory
        AbstractFactory accountFactory = FactoryProducer.getFactory(FactoryType.ACCOUNT);
        //get an object of Saving Account
        Account savingAccount = accountFactory.getAccount(AccountType.SAVING);
        //call accountType method of SavingAccount
        savingAccount.accountType();
        //get an object of Current Account
        Account currentAccount = accountFactory.getAccount(AccountType.CURRENT);
        //call accountType method of CurrentAccount
        currentAccount.accountType();
    }
}
