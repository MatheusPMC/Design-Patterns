package com.company.designpatterns.factory.vehicle;

public class Bike implements IVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando a entrega de bicicleta");
    }

    @Override
    public void getCargo() {
        System.out.println("Já pegamos a sua refeição");
    }
}