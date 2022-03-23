package com.company;

public enum TimeOfRent {
    THREE_DAYS(3), WEEK(7), MONTH(30);

    long days;

    TimeOfRent(long days) {
        this.days = days;
    }
}