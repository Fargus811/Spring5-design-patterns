package com.spring5.design.patterns.chapter2.prototype.pattern.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SavingAccount extends Account {

    @Override
    public void accountType() {
        log.info("SAVING ACCOUNT");
    }

}
