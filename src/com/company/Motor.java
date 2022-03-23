package com.company;

public class Motor extends Vehicle {

    Motor(String model, String brand, Color color, FuelType fuel, double tankCapacity) {
        super(model, brand, color, fuel, tankCapacity);
    }

    @Override
    public String toString() {
        return "Motor{" +
                "model='" + getModel() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", color=" + getColor() +
                ", fuel=" + getFuel() +
                ", tankCapacity=" + getTankCapacity() +
                '}';
    }
}