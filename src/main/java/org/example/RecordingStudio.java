package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class RecordingStudio {

    public void record(Audible somethingWeWantToRecord) {
        System.out.println("I record... " + somethingWeWantToRecord.makeNoise());
    }

    public static void main(String[] args) {
        RecordingStudio myStudio = new RecordingStudio();
        myStudio.record(new Guitar());
        myStudio.record(new Violin());
        myStudio.record(new Saw());

        new StringInstrument();

        List<String> names = new ArrayList<>();
        names.add("Daniel");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }

}
