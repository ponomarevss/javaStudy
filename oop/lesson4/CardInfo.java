package oop.lesson4;

public class CardInfo<T> {
    private final T title;
    private final long timestamp = System.currentTimeMillis();
    private final BookState state;

    public CardInfo(T title, BookState state) {
        this.title = title;
        this.state = state;
    }

    public T getTitle() {
        return title;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public BookState getState() {
        return state;
    }

    @Override
    public String toString() {
        return "CardInfo{" +
                "title=" + title +
                ", timestamp=" + timestamp +
                ", state=" + state +
                '}';
    }
}
