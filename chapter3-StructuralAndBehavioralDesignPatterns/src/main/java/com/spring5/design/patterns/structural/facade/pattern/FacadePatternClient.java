package com.spring5.design.patterns.structural.facade.pattern;

public class FacadePatternClient {

    public static void main(String[] args) {
        BankingServiceFacade serviceFacade = new BankingServiceFacadeImpl();
        serviceFacade.moneyTransfer();
    }
}
