package oop.lesson7.docs;

public class Main {

    public static void main(String[] args) {
        OldDocument od = new OldDocument();
        DocumentAdapter da = new DocumentAdapter(od);

        da.open();
        da.close();
    }

}
