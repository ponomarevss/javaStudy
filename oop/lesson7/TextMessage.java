package oop.lesson7;

public class TextMessage implements Message{
    String message;
    @Override
    public void send() {
        System.out.println(message);
    }
}
