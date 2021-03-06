package com.company.designpatterns.abstractfactory.factories;

import com.company.designpatterns.abstractfactory.aircrafts.Airplane;
import com.company.designpatterns.abstractfactory.aircrafts.IAircraft;
import com.company.designpatterns.abstractfactory.landvehicles.Car;
import com.company.designpatterns.abstractfactory.landvehicles.ILandVehicle;
import com.company.designpatterns.abstractfactory.watervehicles.Boat;
import com.company.designpatterns.abstractfactory.watervehicles.IWaterVehicle;

public class UberTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }

    @Override
    public IWaterVehicle createTransportWaterVehicle() {
        return new Boat();
    }
}
