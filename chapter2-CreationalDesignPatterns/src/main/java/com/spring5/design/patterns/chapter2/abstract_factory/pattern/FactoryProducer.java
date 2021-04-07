package com.spring5.design.patterns.chapter2.abstract_factory.pattern;

import com.spring5.design.patterns.chapter2.adapter.pattern.model.FactoryType;

public class FactoryProducer {

    public static AbstractFactory getFactory(FactoryType factoryType) {
        if(factoryType == FactoryType.ACCOUNT) {
            return new AccountFactory();
        } else if(factoryType == FactoryType.BANK) {
            return new BankFactory();
        }

        return null;
    }

}
