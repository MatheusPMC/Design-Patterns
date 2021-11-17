package com.company.designpatterns.builder.director;

import com.company.designpatterns.builder.builders.IBuilder;
import com.company.designpatterns.builder.components.CarType;
import com.company.designpatterns.builder.components.Engine;
import com.company.designpatterns.builder.components.Transmission;

public class Director {

    public void constructSedanCar(IBuilder builder) {
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setTransmission(Transmission.MANUAL);
        builder.setEngine(new Engine(1600));
    }

    public void constructTruck(IBuilder builder) {
        builder.setCarType(CarType.TRUCK);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(13000));
    }

    public void constructSportingCar(IBuilder builder) {
        builder.setCarType(CarType.SPORTCAR);
        builder.setSeats(2);
        builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL);
        builder.setColor("Laranja");
        builder.setEngine(new Engine(300000));
    }
}