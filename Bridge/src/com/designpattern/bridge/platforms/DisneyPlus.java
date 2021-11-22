package com.designpattern.bridge.platforms;

public class DisneyPlus implements IPlatform {

    public DisneyPlus() {
        configureRHTP();
        System.out.println("DisneyPlus: Transmissão Iniciada");
    }

    @Override
    public void configureRHTP() {
        authToken();
        System.out.println("DisneyPlus: Conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("DisneyPlus: Autorizando aplicação");
    }
}
