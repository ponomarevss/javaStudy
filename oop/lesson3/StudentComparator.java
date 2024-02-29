package oop.lesson3;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student t1, Student t2) {
        String s1 = t1.getName() + t1.getAge();
        String s2 = t2.getName() + t2.getAge();
        return s1.compareTo(s2);
    }
}
