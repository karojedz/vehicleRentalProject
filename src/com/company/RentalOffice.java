package com.company;

import java.time.LocalDateTime;
import java.util.HashMap;

public class RentalOffice {

    private static HashMap<Vehicle, LocalDateTime> rentedVehicles = new HashMap<>();

    public static void rentVehicle(Person renter, Vehicle vehicle, TimeOfRent timeOfRent) {
        if (!(vehicle.isRented())) {
            LocalDateTime timeOfReturn = LocalDateTime.now().plusDays(timeOfRent.days);
            rentedVehicles.put(vehicle, timeOfReturn);
            vehicle.setRented(true);
            vehicle.setRenter(renter);
            vehicle.setReturnTime(timeOfReturn);
        } else {
            System.out.println("Couldn't rent a car. It's already rented to someone.");
        }
    }

    public static void returnVehicle(Vehicle vehicle) {
        rentedVehicles.remove(vehicle);
        vehicle.setRented(false);
        vehicle.setRenter(null);
        vehicle.setReturnTime(null);
    }

    public static void checkIfRented(Vehicle vehicle) {
        LocalDateTime timeOfReturn = rentedVehicles.getOrDefault(vehicle, null);
        if (timeOfReturn==null) {
            System.out.println("This vehicle isn't rented.");
        } else {
            System.out.println("This vehicle is rented.");
        }

    }

}
