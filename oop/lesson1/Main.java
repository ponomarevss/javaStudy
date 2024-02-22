package oop.lesson1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<HotDrink> hotDrinkArrayList = new ArrayList<>();
        hotDrinkArrayList.add(new HotDrink("Кофе", 100.0, 80));
        hotDrinkArrayList.add(new HotDrink("Кофе", 100.0, 60));
        hotDrinkArrayList.add(new HotDrink("Чай", 50.0, 80));
        hotDrinkArrayList.add(new HotDrink("Чай", 50.0, 60));

        HotDrinkVendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine();
        hotDrinkVendingMachine.initProducts(hotDrinkArrayList);
        System.out.println(hotDrinkVendingMachine.getProduct("Чай", 60));
    }
}