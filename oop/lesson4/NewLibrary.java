package oop.lesson4;

import java.util.ArrayList;

public class NewLibrary<T, K> { // создан новый класс в соответствии с OCP
    ArrayList<Material<T>> materials = new ArrayList<>(); // устраняем зависимость в соответствии с DIP
//    ArrayList<Book<T>> books = new ArrayList<>(); // зависимость от Book
    ArrayList<LibraryCard<K, CardInfo<T>>> cards = new ArrayList<>(); // устраняем зависимость в соответствии с DIP
//    ArrayList<LibraryCard<K, SomeFormatCardInfo<T>>> cards = new ArrayList<>(); // зависимость от CardInfo

    public ArrayList<Material<T>> getMaterials() {
//    public ArrayList<Book<T>> getMaterials() {
        return materials;
    }

    public ArrayList<LibraryCard<K, CardInfo<T>>> getCards() {
//    public ArrayList<LibraryCard<K, SomeFormatCardInfo<T>>> getCards() {
        return cards;
    }

    public void addBook(Book<T> book, K cardNum) {
        materials.add(book);
        SomeFormatCardInfo<T> initCardInfo = new SomeFormatCardInfo<>(book.getTitle(), MaterialState.AVAILABLE);
        cards.add(new LibraryCard<>(cardNum, initCardInfo));
    }

    public void provideBook(T title) {
        for (LibraryCard<K, CardInfo<T>> card : cards) {
            if (
                    (card.getInfoLog().getLast().getTitle().equals(title))
                            && (card.getInfoLog().getLast().getState().equals(MaterialState.AVAILABLE))
            ) {
                card.addInfo(new SomeFormatCardInfo<>(title, MaterialState.PROVIDED));
            } else if (
                    (card.getInfoLog().getLast().getTitle().equals(title))
                            && (card.getInfoLog().getLast().getState().equals(MaterialState.PROVIDED))
            ) {
                System.out.println(getByTitle(title) + " is not available");
            }
        }
    }

    private Material<T> getByTitle(T title) {
        for (Material<T> material : materials) {
            if (material.getTitle().equals(title)) {
                return material;
            }
        }
        return null;
    }

    public ArrayList<LibraryCard<K, CardInfo<T>>> getProvided() { // добавил метод предоставляющий список карточек
        ArrayList<LibraryCard<K, CardInfo<T>>> result = new ArrayList<>();
        for (LibraryCard<K, CardInfo<T>> card : cards) {
            if (card.getInfoLog().getLast().getState().equals(MaterialState.PROVIDED)) {
                result.add(card);
            }
        }
        return result;
    }

    // рефактор метода. Показывать будет какой-нибудь View. Библиотека только предоставит список
//    public void showProvided() {
//        for (LibraryCard<K, CardInfo<T>> card : cards) {
//            if (card.getInfoLog().getLast().getState().equals(MaterialState.PROVIDED)) {
//                System.out.println(getByTitle(card.getInfoLog().getLast().getTitle()) + " ---> " + card);
//            }
//        }
//    }
}
