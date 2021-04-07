package com.spring5.design.patterns.chapter2.prototype.pattern;

import com.spring5.design.patterns.chapter2.prototype.pattern.model.CurrentAccount;
import com.spring5.design.patterns.chapter2.adapter.pattern.model.AccountType;
import com.spring5.design.patterns.chapter2.prototype.pattern.model.Account;
import com.spring5.design.patterns.chapter2.prototype.pattern.model.SavingAccount;

import java.util.EnumMap;

public class AccountCache {

    public static EnumMap<AccountType, Account> accountCacheMap = new EnumMap<>(AccountType.class);

    static{
        Account currentAccount = new CurrentAccount();
        Account savingAccount = new SavingAccount();
        accountCacheMap.put(AccountType.SAVING, savingAccount);
        accountCacheMap.put(AccountType.CURRENT, currentAccount);
    }

}
