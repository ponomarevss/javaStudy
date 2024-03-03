package oop.lesson3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Stream stream1 = new Stream(
                new ArrayList<>(
                        List.of(
                                new Group("G1"),
                                new Group("G2"),
                                new Group("G3"),
                                new Group("G4")
                        )
                )
        );
        Stream stream2 = new Stream(
                new ArrayList<>(
                        List.of(
                                new Group("J1"),
                                new Group("J2"),
                                new Group("J3")
                        )
                )
        );

        ArrayList<Stream> faculty = new ArrayList<>(List.of(stream2, stream1));
        faculty.sort(new StreamComparator());
        System.out.println(faculty);

    }
}
