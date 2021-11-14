package com.company.designpatterns.factory;

import com.company.designpatterns.factory.vehicle.IVehicle;
import com.company.designpatterns.factory.vehicle.Motorcycle;

public class MotorcycleTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
