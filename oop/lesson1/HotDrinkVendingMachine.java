package oop.lesson1;

import java.util.ArrayList;

public class HotDrinkVendingMachine implements VendingMachine {
    private ArrayList<HotDrink> hotDrinks;

    public void initProducts(ArrayList<HotDrink> hotDrinks) {
        this.hotDrinks = hotDrinks;
    }

    @Override
    public Product getProduct(String productName) {
        for (HotDrink hotDrink : hotDrinks) {
            if (hotDrink.getName().equals(productName)) {
                return hotDrink;
            }
        }
        return null;
    }

    public Product getProduct(String productName, int temperature) {
        for (HotDrink hotDrink : hotDrinks) {
            if (hotDrink.getName().equals(productName) && hotDrink.getTemperature() == temperature) {
                return hotDrink;
            }
        }
        return null;
    }
}
