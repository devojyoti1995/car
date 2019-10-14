package com.example.Car.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Car")
public class Car {
    @Id
    private String number;
    private String model;
    private String capacity;
    private String rentperday;
    private Reservation booking;

    public Car() {
    }

    public Car(String number, String model, String capacity, String rentperday, Reservation booking) {
        this.number = number;
        this.model = model;
        this.capacity = capacity;
        this.rentperday = rentperday;
        this.booking = booking;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getRentperday() {
        return rentperday;
    }

    public void setRentperday(String rentperday) {
        this.rentperday = rentperday;
    }

    public Reservation getBooking() {
        return booking;
    }

    public void setBooking(Reservation booking) {
        this.booking = booking;
    }
}
