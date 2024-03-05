package oop.lesson4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Library<String, Integer> library = new Library<>();

        library.addBook(new Book<>("Alfa"), 1);
        Thread.sleep(111);
        library.addBook(new Book<>("Bravo"), 2);
        Thread.sleep(111);
        library.addBook(new Book<>("Charlie"), 3);
        Thread.sleep(111);
        library.addBook(new Book<>("Delta"), 4);
        Thread.sleep(111);
        library.addBook(new Book<>("Echo"), 5);
        Thread.sleep(111);
        library.addBook(new Book<>("Foxtrot"), 6);
        Thread.sleep(111);

        library.provideBook("Bravo");
        Thread.sleep(111);
        library.provideBook("Delta");
        Thread.sleep(111);
        library.provideBook("Echo");
        Thread.sleep(111);
        library.provideBook("Delta");

        library.showProvidedBooksAndCards();
    }
}
