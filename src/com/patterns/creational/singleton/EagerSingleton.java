package com.patterns.creational.singleton;

/**
 * Eager singleton
 * In eager initialization, the instance of the singleton class is created at the time of class loading.
 * The drawback to eager initialization is that the method is created even though the client application might not be using it.
 */
public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        super();
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
