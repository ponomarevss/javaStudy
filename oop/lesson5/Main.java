package oop.lesson5;

import oop.lesson5.data.Student;
import oop.lesson5.data.Teacher;
import oop.lesson5.presenter.Presenter;
import oop.lesson5.service.DataService;
import oop.lesson5.service.Service;
import oop.lesson5.service.UserType;
import oop.lesson5.view.ConsoleView;
import oop.lesson5.view.View;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Service data = new DataService();
        View view = new ConsoleView();
        Presenter presenter = new Presenter(data, view);

        presenter.addUser(new Student("Foo", 18));
        presenter.addUser(new Student("Bar", 19));
        presenter.addUser(new Student("Sheldon Cooper", 10));

        presenter.addUser(new Teacher("Susfu", 40, new ArrayList<>(List.of("Art"))));
        presenter.addUser(new Teacher("Fubar", 45, new ArrayList<>(List.of("Literature"))));
        presenter.addUser(new Teacher("Janfu", 48, new ArrayList<>(List.of("Physics"))));

        presenter.showUsers(UserType.STUDENT);
        presenter.showUsers(UserType.TEACHER);

        presenter.showById(UserType.STUDENT, 1);
    }
}
