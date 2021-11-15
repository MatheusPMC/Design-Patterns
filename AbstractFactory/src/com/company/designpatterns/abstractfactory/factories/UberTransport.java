package com.company.designpatterns.abstractfactory.factories;

import com.company.designpatterns.abstractfactory.aircrafts.Airplane;
import com.company.designpatterns.abstractfactory.aircrafts.IAircraft;
import com.company.designpatterns.abstractfactory.landvehicles.Car;
import com.company.designpatterns.abstractfactory.landvehicles.ILandVehicle;

public class UberTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }
}
