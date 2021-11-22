package com.designpattern.bridge.transmissions;

import com.designpattern.bridge.platforms.IPlatform;

public class Live implements ITramission {

    protected IPlatform platform;

    public Live() {

    }

    public Live(IPlatform platform) {
        this.platform = platform;
    }
    @Override
    public void broadcasting() {
        System.out.println("Iniciando a Transmissão");
    }

    @Override
    public void result() {
        System.out.println("*** On Air ***");
    }
}
