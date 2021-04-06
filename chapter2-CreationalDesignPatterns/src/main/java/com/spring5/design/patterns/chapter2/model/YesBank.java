package com.spring5.design.patterns.chapter2.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class YesBank implements Bank {

    @Override
    public void bankName() {
        log.info("Yes Bank Pvt. Ltd");
    }
}
