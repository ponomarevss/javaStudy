package oop.lesson5.presenter;

import oop.lesson5.data.User;
import oop.lesson5.service.Service;
import oop.lesson5.service.UserType;
import oop.lesson5.view.View;

public class Presenter {
    private Service data;
    private View view;

    public Presenter(Service data, View view) {
        this.data = data;
        this.view = view;
    }

    public void addUser(User user){
        data.create(user);
    }

    public void showUsers(UserType userType){
        view.set(data.read(userType));
    }
}
