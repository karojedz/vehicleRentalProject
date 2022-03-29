package com.company;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Getter
public class RentalOffice {

    private ArrayList<VehicleForRent> garage = new ArrayList<>();

    public boolean newVehicleForRent(Vehicle vehicle) {
        return garage.add(new VehicleForRent(vehicle));
    }

    public boolean rentVehicle(Person renter, VehicleForRent vehicleForRent, TimeOfRent timeOfRent) {
        if (!(vehicleForRent.isRented())) {
            LocalDateTime timeOfReturn = LocalDateTime.now().plusDays(timeOfRent.days);
            vehicleForRent.setRented(true);
            vehicleForRent.setRenter(renter);
            vehicleForRent.setReturnTime(timeOfReturn);
            return true;
        } else {
            System.out.println("Couldn't rent a vehicle. It's already rented to someone.");
        }
        return false;
    }

    public boolean returnVehicle(VehicleForRent vehicleForRent) {
        vehicleForRent.setRented(false);
        vehicleForRent.setRenter(null);
        vehicleForRent.setReturnTime(null);
        return true;
    }

    public boolean checkIfRented(VehicleForRent vehicleForRent) {
        LocalDateTime timeOfReturn = vehicleForRent.getReturnTime();
        if (timeOfReturn==null) {
            System.out.println("This vehicle isn't rented.");
            return false;
        } else {
            System.out.println("This vehicle is rented to " + timeOfReturn);
        }
        return true;
    }
}