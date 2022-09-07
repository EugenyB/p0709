package org.example;

public class Counter {

    private int value;

    public int increment() {
        return ++value;
    }

    public int decrement() {
        return --value;
    }

    public int getValue() {
        return value;
    }
}
