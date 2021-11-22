package com.designpattern.bridge.transmissions;

import com.designpattern.bridge.platforms.IPlatform;

public class AdvancedLive extends Live {

    public AdvancedLive(IPlatform platform) {
        super.platform = platform;
    }

    public void subtitles() {
        System.out.println("Legendas ativadas na Transmissão");
    }
    public void comments() {
        System.out.println("Comentários liberados na live");
    }
    public void recordLive() {
        System.out.println("Gravando a live");
    }
}
