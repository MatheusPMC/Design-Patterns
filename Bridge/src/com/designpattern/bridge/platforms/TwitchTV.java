package com.designpattern.bridge.platforms;

public class TwitchTV implements IPlatform {
    public TwitchTV() {
        configureRHTP();
        System.out.println("TwitchTV: Transmissão Iniciada");
    }

    @Override
    public void configureRHTP() {
        authToken();
        System.out.println("TwitchTV: Conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("TwitchTV: Autorizando aplicação");
    }
}
