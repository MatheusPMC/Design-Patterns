package com.company.designpatterns.abstractfactory;

import com.company.designpatterns.abstractfactory.app.Application;
import com.company.designpatterns.abstractfactory.factories.BoatTransport;
import com.company.designpatterns.abstractfactory.factories.ITransportFactory;
import com.company.designpatterns.abstractfactory.factories.NineNineTransport;
import com.company.designpatterns.abstractfactory.factories.UberTransport;

public class Main {

    public static Application configureApplication() {
        Application app;
        ITransportFactory factory;

        String company = "boat";

        if (company == "boat") {
            factory = new UberTransport();
        } else if (company == "boat") {
            factory = new BoatTransport();
        } else {
            factory = new NineNineTransport();
        }
        app = new Application(factory);

        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.startRoute();
    }
}
