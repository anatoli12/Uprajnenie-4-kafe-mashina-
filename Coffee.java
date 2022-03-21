package com.company;

public class Coffee {
    private String name;

    public Coffee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                '}';
    }
}
