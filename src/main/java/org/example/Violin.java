package org.example;

public class Violin extends StringInstrument {

    private boolean withBow;

    public boolean isWithBow() {
        return withBow;
    }

    public void setWithBow(boolean withBow) {
        this.withBow = withBow;
    }

    public String makeNoise() {
        return "Violinnoise";
    }

    @Override
    public String toString() {
        return "Violin{" +
                "numberOfStrings=" + getNumberOfStrings() +
                ", used=" + isUsed() +
                ", withBow=" + withBow +
                '}';
    }
}
