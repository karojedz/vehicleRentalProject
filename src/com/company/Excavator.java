package com.company;

public class Excavator extends Vehicle {

    Excavator(String model, String brand, Color color, FuelType fuel, double tankCapacity) {
        super(model, brand, color, fuel, tankCapacity);
    }

    @Override
    public String toString() {
        return "Excavator{" +
                "model='" + getModel() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", color=" + getColor() +
                ", fuel=" + getFuel() +
                ", tankCapacity=" + getTankCapacity() +
                '}';
    }
}
