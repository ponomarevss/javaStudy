package oop.lesson3;

import java.util.ArrayList;
import java.util.Iterator;

public class Stream implements Iterable<Group>{
    private ArrayList<Group> groups;

    public Stream(ArrayList<Group> groups) {
        this.groups = groups;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    @Override
    public Iterator<Group> iterator() {
        return new StreamIterator(groups);
    }

    @Override
    public String toString() {
        return "Stream{" +
                "groups=" + groups +
                '}';
    }
}
