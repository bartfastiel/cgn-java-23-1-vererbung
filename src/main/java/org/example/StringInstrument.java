package org.example;

public class StringInstrument {
    private int numberOfStrings;
    private boolean used;

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public String makeNoise() {
        return "Some unidentifyable noise";
    }
}
