package com.company.designpatterns.factory;

import com.company.designpatterns.factory.vehicle.Car;
import com.company.designpatterns.factory.vehicle.IVehicle;

public class CarTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
