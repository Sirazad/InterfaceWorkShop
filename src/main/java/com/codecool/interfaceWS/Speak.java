package com.codecool.interfaceWS;

public interface Speak {


    public default void speak(String say) {
        System.out.println(say);
    }

}
