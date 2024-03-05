package oop.lesson4;

public class Book<T> {
    private final T title;

    public Book(T title) {
        this.title = title;
    }

    public T getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title=" + title +
                '}';
    }
}
