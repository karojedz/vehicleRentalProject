package com.company;

public class Main {

    public static void main(String[] args) {

        RentalOffice rentalOffice = new RentalOffice();

        Address address1 = new Address("Rzeszow","Wita", "5", "-", "35-102", "Poland");
        Person p = new Person("Karolina", "Jedziniak", address1, "87483", "jhf");

        Vehicle car = new Car("E46", "BMW", Color.BLUE, FuelType.PB, 60);
        System.out.println(car);
        rentalOffice.newVehicleForRent(car);

        Vehicle motor = new Motor("Mod", "Br", Color.GREEN, FuelType.PB_LPG, 15);
        rentalOffice.newVehicleForRent(motor);


        //to jakoś inaczej trzeba zrobić
        VehicleForRent carForRent = rentalOffice.getGarage().get(0);
        VehicleForRent motorForRent = rentalOffice.getGarage().get(1);

        rentalOffice.rentVehicle(p, carForRent, TimeOfRent.MONTH);
        rentalOffice.rentVehicle(p, carForRent, TimeOfRent.WEEK);
        rentalOffice.checkIfRented(carForRent);
        rentalOffice.checkIfRented(motorForRent);
        rentalOffice.returnVehicle(carForRent);
        rentalOffice.checkIfRented(carForRent);

        System.out.println(rentalOffice.getGarage());
    }
}