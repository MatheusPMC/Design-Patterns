package com.designpattern.bridge.platforms;

public class Facebook implements IPlatform {

    public Facebook() {
        configureRHTP();
        System.out.println("Facebook: Transmissão Iniciada");
    }

    @Override
    public void configureRHTP() {
        authToken();
        System.out.println("Facebook: Conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("Facebook: Autorizando aplicação");
    }
}
