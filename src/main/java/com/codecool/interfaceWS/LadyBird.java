package com.codecool.interfaceWS;

public class LadyBird implements Flying, Feed {

    private final String NAME;
    private final boolean IS_MALE;

    public LadyBird (String name, boolean isMale) {
        this.NAME = name;
        this.IS_MALE = isMale;
    }



    public void fly() {
        System.out.println("Buzz, buzz");
    }

    public void feed() {
        System.out.println("What a wonderful worm");
    }
}
