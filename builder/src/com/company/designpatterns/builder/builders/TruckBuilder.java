package com.company.designpatterns.builder.builders;

import com.company.designpatterns.builder.cars.Car;
import com.company.designpatterns.builder.cars.Truck;
import com.company.designpatterns.builder.components.CarType;
import com.company.designpatterns.builder.components.Engine;
import com.company.designpatterns.builder.components.Transmission;

public class TruckBuilder implements IBuilder {
    private CarType carType;
    private int seats;
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

    public Truck getRusult() {
        return new Truck(carType, seats, engine, transmission);
    }
}
