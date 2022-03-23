package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class RentalOffice {

    private static ArrayList<VehicleForRent> garage = new ArrayList<>();

    public static void newVehicleForRent(Vehicle vehicle) {
        garage.add(new VehicleForRent(vehicle));
    }

    public static void rentVehicle(Person renter, VehicleForRent vehicleForRent, TimeOfRent timeOfRent) {
        if (!(vehicleForRent.isRented())) {
            LocalDateTime timeOfReturn = LocalDateTime.now().plusDays(timeOfRent.days);
            vehicleForRent.setRented(true);
            vehicleForRent.setRenter(renter);
            vehicleForRent.setReturnTime(timeOfReturn);
        } else {
            System.out.println("Couldn't rent a vehicle. It's already rented to someone.");
        }
    }

    public static void returnVehicle(VehicleForRent vehicleForRent) {
        vehicleForRent.setRented(false);
        vehicleForRent.setRenter(null);
        vehicleForRent.setReturnTime(null);
    }

    public static void checkIfRented(VehicleForRent vehicleForRent) {
        LocalDateTime timeOfReturn = vehicleForRent.getReturnTime();
        if (timeOfReturn==null) {
            System.out.println("This vehicle isn't rented.");
        } else {
            System.out.println("This vehicle is rented to " + timeOfReturn);
        }
    }
}