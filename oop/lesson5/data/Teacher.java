package oop.lesson5.data;

import java.util.ArrayList;

public class Teacher extends User{
    private ArrayList<String> disciplines;

    public Teacher(String name, int age, ArrayList<String> disciplines) {
        this.name = name;
        this.age = age;
        this.disciplines = disciplines;
    }

    public ArrayList<String> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(ArrayList<String> disciplines) {
        this.disciplines = disciplines;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", disciplines=" + disciplines +
                '}';
    }
}
