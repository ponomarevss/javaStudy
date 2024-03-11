package oop.lesson5.service;

import oop.lesson5.data.User;

public interface Service {
    void create(User user);
    String read(UserType userType);
}
