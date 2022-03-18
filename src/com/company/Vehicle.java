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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public FuelType getFuel() {
        return fuel;
    }

    public void setFuel(FuelType fuel) {
        this.fuel = fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }
}
