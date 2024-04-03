package com.patterns.creational.singleton;

/**
 * Lazy singleton
 * Lazy initialization method to implement the singleton pattern creates the instance in the global access method.
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton(){
    }
    public static LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
