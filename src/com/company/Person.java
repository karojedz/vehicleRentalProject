package com.company;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Person {

    private String firstName;
    private String lastName;
    private Address address;
    private String phoneNumber;
    private String emailAddress;

}
