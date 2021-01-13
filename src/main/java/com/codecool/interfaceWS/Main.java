package com.codecool.interfaceWS;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Flying> animals = new ArrayList();
        animals.add(new LadyBird("Katica", false));
        animals.add(new LadyBird ("Katika", false));
        animals.add(new LadyBird ("Karesz", true));
        animals.add(new Bird ("Bibi", false));
        animals.add(new Bird ("Bélus", true));
        animals.add(new Bird ("Jónás", true));


        for (Flying animal: animals) {
            animal.fly();
            ((Feed) animal).feed();
        }

    }

}
