package com.spring5.design.patterns.chapter2.singleton.pattern;

public class SingletonPatternMain {

    public static void main(String[] args) {
        //get singletonClassInstance (Should create and return instance)
        SingletonClass.getInstance();
        //get singletonClassInstance (Should return instance without creation)
        SingletonClass.getInstance();
    }

}
