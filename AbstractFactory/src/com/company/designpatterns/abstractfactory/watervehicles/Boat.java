package com.company.designpatterns.abstractfactory.watervehicles;

public class Boat implements IWaterVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando a viagem");
    }

    @Override
    public void getCargo() {
        System.out.println("Atravesando o oceano!");
    }
}
