package com.spring5.design.patterns.chapter2.singleton.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Singleton is an anti-pattern. It is not recommended to use it
* */
@Slf4j
public class SingletonClass {

    private static volatile SingletonClass instance = null;

    private SingletonClass() {
        log.info("Create SingletonClass instance");
    }

    @SuppressWarnings("all")
    public static SingletonClass getInstance() {
        if(instance == null) {
            synchronized(SingletonClass.class){
                if (instance == null) {
                    instance = new SingletonClass();
                }
            }
        }

        log.info("Return SingletonClass instance");

        return instance;
    }
}
