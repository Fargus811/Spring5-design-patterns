package com.spring5.design.patterns.chapter2.prototype.pattern;

import com.spring5.design.patterns.chapter2.adapter.pattern.model.AccountType;
import com.spring5.design.patterns.chapter2.prototype.pattern.model.Account;


public class PrototypePatternMain {

    public static void main(String[] args) {
        Account currentAccount = (Account) AccountCache.accountCacheMap.get(AccountType.CURRENT).clone();
        currentAccount.accountType();

        Account savingAccount = (Account) AccountCache.accountCacheMap.get(AccountType.SAVING).clone();
        savingAccount.accountType();
    }

}
