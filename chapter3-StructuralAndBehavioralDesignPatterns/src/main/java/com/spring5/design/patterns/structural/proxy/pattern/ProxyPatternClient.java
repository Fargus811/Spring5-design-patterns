package com.spring5.design.patterns.structural.proxy.pattern;

import com.spring5.design.patterns.structural.facade.pattern.Account;

public class ProxyPatternClient {

    public static void main(String[] args) {
        Account account = new ProxySavingAccount();
        account.accountType();
    }
}
