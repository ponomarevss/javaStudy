package oop.lesson7.decorator;

import oop.lesson7.decorator.Message;

public class TextMessage implements Message {
    String message;
    @Override
    public void send() {
        System.out.println(message);
    }
}
