package com.company.designpatterns.factory;

import com.company.designpatterns.factory.vehicle.IVehicle;

public abstract class Transport {

    void startTransport() {
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract IVehicle createTransport();
}