package com.patterns.behavioral.strategy;

public class DefaultBehavior implements Behavior{
    @Override
    public void move() {
        System.out.println("Normal movement");
    }
}
