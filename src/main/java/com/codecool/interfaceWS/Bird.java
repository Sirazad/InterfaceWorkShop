package com.codecool.interfaceWS ;

public class Bird implements Flying, Feed {

    private final String NAME;
    private final boolean IS_MALE;

    public Bird (String name, boolean isMale) {
        this.NAME = name;
        this.IS_MALE = isMale;
    }


    public void fly() {
        System.out.println("Chirp, chirp");
    }

    public void feed() {
        System.out.println("I love aphid.");
    }
}
