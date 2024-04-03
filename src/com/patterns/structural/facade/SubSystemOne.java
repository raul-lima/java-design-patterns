package com.patterns.structural.facade;

public class SubSystemOne {

    private SubSystemOne(){

    }

    public static void saveClient(String name, String address, String number){
        System.out.println("Saving client on System One");
    }
}
