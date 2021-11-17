package com.company.designpatterns.builder.builders;

import com.company.designpatterns.builder.cars.Car;
import com.company.designpatterns.builder.components.CarType;
import com.company.designpatterns.builder.components.Engine;
import com.company.designpatterns.builder.components.Transmission;

public class CarBuilder implements IBuilder {
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

    public Car getRusult() {
        return  new Car(carType, seats, engine, transmission);
    }
}
