package com.company;

public abstract class Vehicle {

    private String model;
    private String brand;
    private Color color;
    private FuelType fuel;
    private double tankCapacity;

    Vehicle(String model, String brand, Color color, FuelType fuel, double tankCapacity) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", color=" + color +
                ", fuel=" + fuel +
                ", tankCapacity=" + tankCapacity +
                '}';
    }
}
