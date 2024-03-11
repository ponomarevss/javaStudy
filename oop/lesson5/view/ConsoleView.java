package oop.lesson5.view;

import java.util.Scanner;

public class ConsoleView implements View{

    @Override
    public String get() {
        try(Scanner in = new Scanner(System.in)) {
            return in.next();
        }
    }

    @Override
    public void set(String value) {
        System.out.println(value);
    }
}
