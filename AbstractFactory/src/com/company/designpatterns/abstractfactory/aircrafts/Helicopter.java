package com.company.designpatterns.abstractfactory.aircrafts;

public class Helicopter implements IAircraft{
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Inciando a decolagem");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros ok, ligando Hélices");
    }

    @Override
    public void wind() {
        System.out.println("Ventos 25kms, Suldeste, Ventos ok!");
    }
}
