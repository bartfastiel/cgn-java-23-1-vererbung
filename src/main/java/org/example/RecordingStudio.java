package org.example;

public class RecordingStudio {

    public void record(StringInstrument instrument) {
        System.out.println("I record... " + instrument.makeNoise());
    }

    public static void main(String[] args) {
        RecordingStudio myStudio = new RecordingStudio();
        myStudio.record(new Guitar());
        myStudio.record(new Violin());
    }

}
