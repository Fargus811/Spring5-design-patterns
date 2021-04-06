package com.spring5.design.patterns.chapter2.builder.pattern;

import lombok.Data;

@Data
public class Account {

    private String accountName;
    private Long accountNumber;
    private String accountHolder;
    private double balance;
    private String type;
    private double interest;

    Account(String accountName, Long accountNumber, String accountHolder, double balance, String type, double interest) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.type = type;
        this.interest = interest;
    }

    public static AccountBuilder builder() {
        return new AccountBuilder();
    }

    public static class AccountBuilder {
        private String accountName;
        private Long accountNumber;
        private String accountHolder;
        private double balance;
        private String type;
        private double interest;

        AccountBuilder() {
        }

        public AccountBuilder(String accountName, String accountHolder, Long accountNumber) {
            this.accountName = accountName;
            this.accountHolder = accountHolder;
            this.accountNumber = accountNumber;
        }

        public AccountBuilder accountName(String accountName) {
            this.accountName = accountName;
            return this;
        }

        public AccountBuilder accountNumber(Long accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public AccountBuilder accountHolder(String accountHolder) {
            this.accountHolder = accountHolder;
            return this;
        }

        public AccountBuilder balance(double balance) {
            this.balance = balance;
            return this;
        }

        public AccountBuilder type(String type) {
            this.type = type;
            return this;
        }

        public AccountBuilder interest(double interest) {
            this.interest = interest;
            return this;
        }

        public Account build() {
            return new Account(accountName, accountNumber, accountHolder, balance, type, interest);
        }

        public String toString() {
            return "Account.AccountBuilder(accountName=" + this.accountName + ", accountNumber=" + this.accountNumber +
                    ", accountHolder=" + this.accountHolder + ", balance=" + this.balance + ", type=" + this.type +
                    ", interest=" + this.interest + ")";
        }
    }
}
