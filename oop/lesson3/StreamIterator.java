package oop.lesson3;

import java.util.ArrayList;
import java.util.Iterator;

public class StreamIterator implements Iterator<Group> {

    private ArrayList<Group> groups;
    private int count;

    public StreamIterator(ArrayList<Group> groups) {
        this.groups = groups;
        this.count = 0;
    }

    @Override
    public boolean hasNext() {
        return count < groups.size();
    }

    @Override
    public Group next() {
        return groups.get(count++);
    }
}
