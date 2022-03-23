package com.company;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
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
    public boolean equals(Object o) {
        return this == o;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getBrand(), getColor(), getFuel(), getTankCapacity());
    }
}