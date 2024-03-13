package oop.lesson6;

import java.util.ArrayList;

public class Library<T, K> { // старый класс. оставляю нетронутым в соответствии с OCP
    ArrayList<Book<T>> book = new ArrayList<>();
    ArrayList<LibraryCard<K, SomeFormatCardInfo<T>>> cards = new ArrayList<>();

    public ArrayList<Book<T>> getBooks() {
        return book;
    }

    public ArrayList<LibraryCard<K, SomeFormatCardInfo<T>>> getCards() {
        return cards;
    }

    public void addBook(Book<T> book, K cardNum) {
        this.book.add(book);
        SomeFormatCardInfo<T> initCardInfo = new SomeFormatCardInfo<>(book.getTitle(), MaterialState.AVAILABLE);
        cards.add(new LibraryCard<>(cardNum, initCardInfo));
    }

    public void provideBook(T title) {
        for (LibraryCard<K, SomeFormatCardInfo<T>> card : cards) {
            if (
                    (card.getInfoLog().getLast().getTitle().equals(title))
                            && (card.getInfoLog().getLast().getState().equals(MaterialState.AVAILABLE))
            ) {
                card.addInfo(new SomeFormatCardInfo<>(title, MaterialState.PROVIDED));
            } else if (
                    (card.getInfoLog().getLast().getTitle().equals(title))
                            && (card.getInfoLog().getLast().getState().equals(MaterialState.PROVIDED))
            ) {
                System.out.println(getBookByTitle(title) + " is not available");
            }
        }
    }

    private Book<T> getBookByTitle(T title) {
        for (Book<T> book : book) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public void showProvidedBooksAndCards() {
        for (LibraryCard<K, SomeFormatCardInfo<T>> card : cards) {
            if (card.getInfoLog().getLast().getState().equals(MaterialState.PROVIDED)) {
                System.out.println(getBookByTitle(card.getInfoLog().getLast().getTitle()) + " ---> " + card);
            }
        }
    }
}
