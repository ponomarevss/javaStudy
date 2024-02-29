package oop.lesson3;

import java.util.Iterator;
import java.util.List;

public class GroupIterator implements Iterator<Student> {
    private List<Student> students;
    private int count;

    public GroupIterator(List<Student> students) {
        this.students = students;
        this.count = 0;
    }

    @Override
    public boolean hasNext() {
        return count < students.size();
    }

    @Override
    public Student next() {
        return students.get(count++);
    }
}
