package com.company;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Address {

    private String city;
    private String street;
    private String buildingNumber;
    private String apartmentNumber;
    private String zipCode;
    private String country;
}