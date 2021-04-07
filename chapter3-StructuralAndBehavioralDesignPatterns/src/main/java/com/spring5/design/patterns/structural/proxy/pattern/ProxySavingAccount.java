package com.spring5.design.patterns.structural.proxy.pattern;

import com.spring5.design.patterns.structural.facade.pattern.Account;
import com.spring5.design.patterns.structural.facade.pattern.impl.SavingAccount;

public class ProxySavingAccount implements Account{

    private Account savingAccount;

    @Override
    public void accountType() {
        if(savingAccount == null){
            savingAccount = new SavingAccount();
        }
        savingAccount.accountType();
    }

}

