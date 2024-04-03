package com.patterns.structural.facade;

import com.patterns.creational.singleton.EagerSingleton;

public class SubSystemTwo {


    private static SubSystemTwo instance = new SubSystemTwo();

    private SubSystemTwo() {

    }

    public static SubSystemTwo getInstance() {
        return instance;
    }

    public String getNumber(String number){
        return number;
    }
}
