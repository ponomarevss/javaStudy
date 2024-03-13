package oop.lesson4;

public class SomeFormatCardInfo<T> implements CardInfo<T> { // реализуем DIP, имплементируем CardInfo<T>
    // Абстрагируемся от Book. Удалены все упоминания Book
    //public class CardInfo<T> { // ренейм класса. CardInfo<T> - будет название интерфейса
    private final T title;
    private final long timestamp = System.currentTimeMillis();
    private final MaterialState state;

    public SomeFormatCardInfo(T title, MaterialState state) {
        this.title = title;
        this.state = state;
    }

    @Override
    public T getTitle() {
        return title;
    }

    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public MaterialState getState() {
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
