package com.codecool.interfaceWS;

public class Dog implements Feed{
    @Override
    public void feed() {
        System.out.println("Food, FOOOD!");
    }
}
