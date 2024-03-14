package oop.lesson7.docs;

public class DocumentAdapter implements Document{
    OldDocument oldDocument;

    public DocumentAdapter(OldDocument oldDocument) {
        this.oldDocument = oldDocument;
    }

    @Override
    public void open() {
        oldDocument.open();
    }

    @Override
    public void close() {
        oldDocument.close();
    }
}
