package com.company.designpatterns.builder.builders;

import com.company.designpatterns.builder.cars.SportingCar;
import com.company.designpatterns.builder.components.CarType;
import com.company.designpatterns.builder.components.Engine;
import com.company.designpatterns.builder.components.Transmission;

public class SportingCarBuilder implements IBuilder {
    private CarType carType;
    private int seats;
    private String color;
    private Transmission transmission;
    private Engine engine;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public SportingCar getRusult() {
        return  new SportingCar(carType, seats, color, engine, transmission);
    }
}
