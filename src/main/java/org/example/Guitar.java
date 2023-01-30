package org.example;

public class Guitar extends StringInstrument {

    private static final int MAX_PRICE_IN_CENT = 2_000_00;

    private String guitarType;

    public String getGuitarType() {
        return guitarType;
    }

    public void setGuitarType(String guitarType) {
        this.guitarType = guitarType;
    }

    public String makeNoise() {
        return "Guitarnoise";
    }

    static String makeLoud(String noise) {
        return "Loud " + noise;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "numberOfStrings=" + getNumberOfStrings() +
                ", used=" + isUsed() +
                ", guitarType='" + guitarType + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Guitar myWestern = new Guitar();
        myWestern.setNumberOfStrings(6);
        myWestern.setUsed(false);

        Guitar.unpackPlayAndUseIt(myWestern);

        System.out.println(myWestern.isUsed());
    }

    private static void unpackPlayAndUseIt(Guitar instrument) {
        Guitar internal = instrument;
        System.out.println(instrument.makeNoise());
        internal.setUsed(true);
    }
}
