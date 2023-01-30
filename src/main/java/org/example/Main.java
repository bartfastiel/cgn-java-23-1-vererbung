package org.example;

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

        System.out.println(myWestern);
        System.out.println(myEViolin);

    }
}