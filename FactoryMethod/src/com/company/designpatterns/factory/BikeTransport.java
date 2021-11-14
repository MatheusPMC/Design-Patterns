package com.company.designpatterns.factory;

import com.company.designpatterns.factory.vehicle.Bike;
import com.company.designpatterns.factory.vehicle.IVehicle;

public class BikeTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}