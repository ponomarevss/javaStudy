package oop.lesson7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MessageDecorator implements Message{
    Message message;
    Long timestamp;

    public MessageDecorator(Message message) {
        this.message = message;
    }

    @Override
    public void send() {
        message.send();
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fdt = ldt.format(dtf);
        System.out.println(fdt);
    }
}
