package com.spring5.design.patterns.chapter2.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SavingAccount implements Account {

    @Override
    public void accountType() {
        log.info("SAVING ACCOUNT");
    }
}
