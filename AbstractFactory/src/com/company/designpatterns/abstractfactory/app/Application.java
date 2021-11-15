package com.company.designpatterns.abstractfactory.app;

import com.company.designpatterns.abstractfactory.aircrafts.IAircraft;
import com.company.designpatterns.abstractfactory.factories.ITransportFactory;
import com.company.designpatterns.abstractfactory.landvehicles.ILandVehicle;
import com.company.designpatterns.abstractfactory.watervehicles.IWaterVehicle;

public class Application {
    private ILandVehicle vehicle;
    private IAircraft aircraft;
    private IWaterVehicle boat;

    public Application(ITransportFactory factory) {
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
        boat = factory.createTransportWaterVehicle();
    }

    public void startRoute() {
        vehicle.startRoute();
        aircraft.startRoute();
        boat.startRoute();
    }
}
