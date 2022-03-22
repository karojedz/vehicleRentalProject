package com.company;

public class Main {

    public static void main(String[] args) {

        Address address1 = new Address("Rzeszow","Wita", "5", "-", "35-102", "Poland");
        Person p = new Person("Karolina", "Jedziniak", address1, "87483", "jhf");

        Vehicle car = new Car("E46", "BMW", Color.BLUE, FuelType.PB, 60);
        System.out.println(car);

        Vehicle motor = new Motor("Mod", "Br", Color.GREEN, FuelType.PB_LPG, 15);

        RentalOffice.rentVehicle(p, car, TimeOfRent.MONTH);
        RentalOffice.rentVehicle(p, car, TimeOfRent.WEEK);
        RentalOffice.checkIfRented(car);
        RentalOffice.checkIfRented(motor);
        RentalOffice.returnVehicle(car);
        RentalOffice.checkIfRented(car);


    }
}
