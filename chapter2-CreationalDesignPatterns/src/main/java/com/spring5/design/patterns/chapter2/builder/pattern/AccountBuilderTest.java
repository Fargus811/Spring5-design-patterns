package com.spring5.design.patterns.chapter2.builder.pattern;

public class AccountBuilderTest {

    public static void main(String[] args) {
        Account account = new Account.AccountBuilder("Saving Account", "Dinesh Rajput", 1111l)
                .balance(38458.32)
                .interest(4.5)
                .type("SAVING")
                .build();

        System.out.println(account);
    }
}
