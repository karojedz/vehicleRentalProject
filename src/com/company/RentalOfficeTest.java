package com.company;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class RentalOfficeTest {

    private RentalOffice rentalOffice;
    private Vehicle vehicle;
    private VehicleForRent vehicleForRent;
    private Address address;
    private Person person;

    @BeforeEach
    void setUp() {
    rentalOffice = new RentalOffice();
    vehicle = new Excavator("A", "B", Color.GREEN, FuelType.PB_LPG, 300.0);
    vehicleForRent = new VehicleForRent(vehicle);
    address = new Address("C", "S", "1", "2", "0", "P");
    person = new Person("F", "L", address, "111", "FL@g.c");
    }

    @Test
    void newVehicleForRent() {
        rentalOffice.newVehicleForRent(vehicle);

        assertEquals(1, rentalOffice.getGarage().size());
    }

    @Test
    void rentVehicle() {
        boolean rentWentWell = rentalOffice.rentVehicle(person, vehicleForRent, TimeOfRent.MONTH);

        assertTrue(rentWentWell);
        assertTrue(vehicleForRent.isRented());
        assertEquals(person, vehicleForRent.getRenter());
        assertNotNull(vehicleForRent.getReturnTime());
    }

    @Test
    void rentVehicleWhileRented() {
        rentalOffice.rentVehicle(person, vehicleForRent, TimeOfRent.MONTH);
        Person personTwo = new Person("U", "R", address, "0123", "UR@gr.upa");

        boolean rentWentWrong = rentalOffice.rentVehicle(personTwo, vehicleForRent, TimeOfRent.WEEK);

        assertFalse(rentWentWrong);
    }

    @Test
    void returnVehicle() {
        rentalOffice.rentVehicle(person, vehicleForRent, TimeOfRent.MONTH);
        assertTrue(vehicleForRent.isRented());

        rentalOffice.returnVehicle(vehicleForRent);

        assertFalse(vehicleForRent.isRented());
        assertNull(vehicleForRent.getReturnTime());
        assertNull(vehicleForRent.getRenter());
    }

    @Test
    void checkIfRented() {
        boolean checkBeforeRenting = rentalOffice.checkIfRented(vehicleForRent);
        assertFalse(checkBeforeRenting);
        rentalOffice.rentVehicle(person, vehicleForRent, TimeOfRent.THREE_DAYS);

        boolean checkAfterRenting = rentalOffice.checkIfRented(vehicleForRent);
        assertTrue(checkAfterRenting);
    }

    @Test
    void getGarage() {
        List<VehicleForRent> list = rentalOffice.getGarage();

        assertNotNull(list);
    }
}