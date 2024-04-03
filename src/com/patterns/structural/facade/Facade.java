package com.patterns.structural.facade;

public class Facade {

    public void migrateClient(String name, String address) {
        String number = SubSystemTwo.getInstance().getNumber(address);
        SubSystemOne.saveClient(name, address, number);
    }
}
