import java.util.Objects;

public class Notebook {
    private String processor;
    private String randomAccessMemory;
    private String hardDrive;
    private String graphicsProcessor;
    private String displaySize;
    private int price;

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRandomAccessMemory() {
        return randomAccessMemory;
    }

    public void setRandomAccessMemory(String randomAccessMemory) {
        this.randomAccessMemory = randomAccessMemory;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public String getGraphicsProcessor() {
        return graphicsProcessor;
    }

    public void setGraphicsProcessor(String graphicsProcessor) {
        this.graphicsProcessor = graphicsProcessor;
    }

    public String getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(String displaySize) {
        this.displaySize = displaySize;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Notebook(
            String processor,
            String randomAccessMemory,
            String hardDrive,
            String graphicsProcessor,
            String displaySize,
            int price
    ) {
        this.processor = processor;
        this.randomAccessMemory = randomAccessMemory;
        this.hardDrive = hardDrive;
        this.graphicsProcessor = graphicsProcessor;
        this.displaySize = displaySize;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "processor='" + processor + '\'' +
                ", randomAccessMemory=" + randomAccessMemory +
                ", hardDrive=" + hardDrive +
                ", graphicsProcessor='" + graphicsProcessor + '\'' +
                ", displaySize=" + displaySize +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Notebook)) return false;
        Notebook notebook = (Notebook) o;
        return Objects.equals(getRandomAccessMemory(), notebook.getRandomAccessMemory()) &&
                Objects.equals(getHardDrive(), notebook.getHardDrive()) &&
                Objects.equals(getDisplaySize(), notebook.getDisplaySize()) &&
                Objects.equals(getProcessor(), notebook.getProcessor()) &&
                Objects.equals(getGraphicsProcessor(), notebook.getGraphicsProcessor()) &&
                getPrice() == notebook.getPrice();
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getProcessor(),
                getRandomAccessMemory(),
                getHardDrive(),
                getGraphicsProcessor(),
                getDisplaySize(),
                getPrice()
        );
    }
}
