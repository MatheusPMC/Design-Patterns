package com.company.designpatterns.builder.cars;

import com.company.designpatterns.builder.components.CarType;
import com.company.designpatterns.builder.components.Engine;
import com.company.designpatterns.builder.components.Transmission;

public class SportingCar {

    private final CarType carType;
    private final int seats;
    private final String color;
    private final Engine engine;
    private final Transmission transmission;

    public SportingCar(CarType carType,
                       int seats,
                       String color,
                       Engine engine,
                       Transmission transmission) {
        this.carType = carType;
        this.seats = seats;
        this.color = color;
        this.engine = engine;
        this.transmission = transmission;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }
}

