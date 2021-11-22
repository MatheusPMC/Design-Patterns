package com.designpattern.bridge.platforms;

public class YouTube implements IPlatform {
    public YouTube() {
        configureRHTP();
        System.out.println("YouTube: Transmissão Iniciada");
    }

    @Override
    public void configureRHTP() {
        authToken();
        System.out.println("YouTube: Configurando broadcasting");
    }

    @Override
    public void authToken() {
        System.out.println("YouTube: Autorizando aplicação");
    }
}
