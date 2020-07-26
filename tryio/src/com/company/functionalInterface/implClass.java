package com.company.functionalInterface;

public class implClass implements CustomInterface {

    @Override
    public void methodRef(String name) {
        System.out.println("Your name is: " + name);
    }
}
