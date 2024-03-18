package oop.lesson7.decorator;

public class NewMain {
    public static void main(String[] args) {
        TextMessage tm = new TextMessage();
        tm.message = "Hristos Voskres";
        MessageDecorator md = new MessageDecorator(tm);
        md.send();
    }
}
