package oop.lesson3;

import java.util.ArrayList;
import java.util.Iterator;

public class Group implements Iterable<Student>{
    private ArrayList<Student> students;

    public Group(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public Iterator<Student> iterator() {
        return new GroupIterator(students);
    }
}
