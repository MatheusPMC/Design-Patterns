package com.company.designpatterns.abstractfactory.factories;

import com.company.designpatterns.abstractfactory.aircrafts.Helicopter;
import com.company.designpatterns.abstractfactory.aircrafts.IAircraft;
import com.company.designpatterns.abstractfactory.landvehicles.ILandVehicle;
import com.company.designpatterns.abstractfactory.landvehicles.Motorcycle;
import com.company.designpatterns.abstractfactory.watervehicles.Boat;
import com.company.designpatterns.abstractfactory.watervehicles.IWaterVehicle;

public class NineNineTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }

    @Override
    public IWaterVehicle createTransportWaterVehicle() {
        return new Boat();
    }
}
