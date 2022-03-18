package com.company;

public class Car extends Vehicle {

    Car(String model, String brand, Color color, FuelType fuel, double tankCapacity) {
        super(model, brand, color, fuel, tankCapacity);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + getModel() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", color=" + getColor() +
                ", fuel=" + getFuel() +
                ", tankCapacity=" + getTankCapacity() +
                '}';
    }
}
