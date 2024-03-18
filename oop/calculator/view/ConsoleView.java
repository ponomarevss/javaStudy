package oop.calculator.view;

import java.util.Scanner;

public class ConsoleView implements View {
    Scanner scanner;

    public ConsoleView(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String get(String invitation) {
        System.out.print(invitation);
        return scanner.nextLine();
    }

    @Override
    public void set(String value) {
        System.out.println(value);
    }
}
