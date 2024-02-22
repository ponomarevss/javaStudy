package oop.lesson1;

import java.util.ArrayList;

public class WaterVendingMachine implements VendingMachine {
    private ArrayList<BottledWater> bottles;

    public void initProducts(ArrayList<BottledWater> bottles) {
        this.bottles = bottles;
    }

    @Override
    public Product getProduct(String productName) {
        for (BottledWater bottledWater : bottles) {
            if (bottledWater.getName().equals(productName)){
                return bottledWater;
            }
        }
        return null;
    }
}
