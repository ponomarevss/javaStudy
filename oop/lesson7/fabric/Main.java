package oop.lesson7.fabric;

public class Main {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza = pizzaFactory.createPizza("Swarma");

        System.out.println(pizza);
    }
}
