package org.example;

public class Guitar extends StringInstrument {

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


    @Override
    public String toString() {
        return "Guitar{" +
                "numberOfStrings=" + getNumberOfStrings() +
                ", used=" + isUsed() +
                ", guitarType='" + guitarType + '\'' +
                '}';
    }
}
