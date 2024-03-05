package oop.lesson4;

/*
 * Создайте класс Library, который будет представлять библиотеку.
 * У этого класса должны быть методы для добавления книг и выдачи библиотечных карточек.
 * Добавьте метод для вывода информации о всех выданных книгах с их библиотечными карточками.
 * */

import java.util.ArrayList;

public class Library<T, K> {
    ArrayList<Book<T>> books = new ArrayList<>();
    ArrayList<LibraryCard<K, CardInfo<T>>> cards = new ArrayList<>();

    public ArrayList<Book<T>> getBooks() {
        return books;
    }

    public ArrayList<LibraryCard<K, CardInfo<T>>> getCards() { // метод выдачи библиотечных карточек
        return cards;
    }

    public void addBook(Book<T> book, K cardNum) { // метод для добавления книг
        books.add(book);
        CardInfo<T> initCardInfo = new CardInfo<>(book.getTitle(), BookState.AVAILABLE);
        cards.add(new LibraryCard<>(cardNum, initCardInfo));
    }

    public void provideBook(T title) {
        for (LibraryCard<K, CardInfo<T>> card : cards) {
            if (
                    (card.getBookInfoLog().getLast().getTitle().equals(title))
                            && (card.getBookInfoLog().getLast().getState().equals(BookState.AVAILABLE))
            ) {
                card.addInfo(new CardInfo<>(title, BookState.PROVIDED));
            } else if (
                    (card.getBookInfoLog().getLast().getTitle().equals(title))
                            && (card.getBookInfoLog().getLast().getState().equals(BookState.PROVIDED))
            ) {
                System.out.println(getBookByTitle(title) + " is not available");
            }
        }
    }

    private Book<T> getBookByTitle(T title) {
        for (Book<T> book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public void showProvidedBooksAndCards() {
        for (LibraryCard<K, CardInfo<T>> card : cards) {
            if (card.bookInfoLog.getLast().getState().equals(BookState.PROVIDED)) {
                System.out.println(getBookByTitle(card.getBookInfoLog().getLast().getTitle()) + " ---> " + card);
            }
        }
    }
}
