package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Guitar myWestern = new Guitar();
        myWestern.setNumberOfStrings(6);
        myWestern.setUsed(true);
        myWestern.setGuitarType("Western");

        Violin myEViolin = new Violin();
        myEViolin.setNumberOfStrings(4);
        myEViolin.setUsed(true);
        myEViolin.setWithBow(true);

        List<StringInstrument> all = new ArrayList<>();
        all.add(myWestern);
        all.add(myEViolin);

        for (int i = 0; i < all.size(); i++) {
            StringInstrument currentInstrument = all.get(i);
            System.out.println(currentInstrument);
        }

        StringInstrument s = new Guitar();
        String noise = s.makeNoise();
        System.out.println(noise);

    }
}