package oop.lesson6;

import java.util.LinkedList;

public class LibraryCard<K, V> { // Абстрагируемся от Book. Удалены все упоминания Book
    private K cardNum;
    private LinkedList<V> infoLog = new LinkedList<>();

    public LibraryCard(K cardNum, V initialInfo) {
        this.cardNum = cardNum;
        infoLog.add(initialInfo);
    }

    public K getCardNum() {
        return cardNum;
    }

    public LinkedList<V> getInfoLog() {
        return infoLog;
    }

    public void addInfo(V info) {
        infoLog.add(info);
    }

    @Override
    public String toString() {
        return "LibraryCard{" +
                "cardNum=" + cardNum +
                ", infoLog=" + infoLog +
                '}';
    }
}
