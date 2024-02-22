package oop.lesson1;

public class HotDrink extends Product{
    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public HotDrink(String name, double cost, int temperature) {
        super(name, cost);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getCost() +
                ", temperature=" + temperature +
                '}';
    }
}
