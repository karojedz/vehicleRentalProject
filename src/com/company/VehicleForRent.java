package com.company;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class VehicleForRent {

    private Vehicle vehicle;
    private boolean rented = false;
    private LocalDateTime returnTime = null;
    private Person renter = null;

    VehicleForRent(Vehicle vehicle) {
        setVehicle(vehicle);

    }
}
