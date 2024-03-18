package oop.lesson7.fabric;

public class PizzaFactory {
    public Pizza createPizza(String name){
        switch (name) {
            case "Margherita":
                return new MargheritaPizza();
            case "Pepperoni":
                return new PepperoniPizza();
            case "Vegetarian":
                return new VegetarianPizza();
            default:
                return null;
        }
    }
}
