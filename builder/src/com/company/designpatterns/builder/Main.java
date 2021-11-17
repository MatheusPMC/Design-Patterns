package com.company.designpatterns.builder;

import com.company.designpatterns.builder.builders.CarBuilder;
import com.company.designpatterns.builder.builders.TruckBuilder;
import com.company.designpatterns.builder.cars.Car;
import com.company.designpatterns.builder.cars.Truck;
import com.company.designpatterns.builder.director.Director;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        //criando o carro
        CarBuilder builder = new CarBuilder();
        director.constructSedanCar(builder);

        Car car = builder.getRusult();
        System.out.println(car.getCarType() + " produzido com sucesso!");


        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);

        Truck truck = truckBuilder.getRusult();
        System.out.println("Caminhão: " +truck.result());

    }
}
