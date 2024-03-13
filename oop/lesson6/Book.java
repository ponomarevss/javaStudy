package oop.lesson6;

public class Book<T> implements Material<T>{ // реализуем DIP имплементируя интерфейс Material<T>
    private final T title;

    public Book(T title) {
        this.title = title;
    }

    @Override
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
