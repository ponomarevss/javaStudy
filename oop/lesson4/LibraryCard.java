package oop.lesson4;

import java.util.ArrayList;
import java.util.LinkedList;

public class LibraryCard<K, V> {
    K cardNum;
    LinkedList<V> bookInfoLog = new LinkedList<>();

    public LibraryCard(K cardNum, V initialBookInfo) {
        this.cardNum = cardNum;
        bookInfoLog.add(initialBookInfo);
    }

    public K getCardNum() {
        return cardNum;
    }

    public LinkedList<V> getBookInfoLog() {
        return bookInfoLog;
    }

    public void addInfo(V bookInfo) {
        bookInfoLog.add(bookInfo);
    }

    @Override
    public String toString() {
        return "LibraryCard{" +
                "cardNum=" + cardNum +
                ", bookInfoLog=" + bookInfoLog +
                '}';
    }
}
