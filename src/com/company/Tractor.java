package com.company;

public class Tractor extends Vehicle {

    Tractor(String model, String brand, Color color, FuelType fuel, double tankCapacity) {
        super(model, brand, color, fuel, tankCapacity);
    }

    @Override
    public String toString() {
        return "Tractor{" +
                "model='" + getModel() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", color=" + getColor() +
                ", fuel=" + getFuel() +
                ", tankCapacity=" + getTankCapacity() +
                '}';
    }
}