package com.company.designpatterns.abstractfactory.factories;

import com.company.designpatterns.abstractfactory.aircrafts.IAircraft;
import com.company.designpatterns.abstractfactory.landvehicles.ILandVehicle;
import com.company.designpatterns.abstractfactory.watervehicles.IWaterVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
    IWaterVehicle createTransportWaterVehicle();
}
