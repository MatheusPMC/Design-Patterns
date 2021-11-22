package com.designpattern.bridge;

import com.designpattern.bridge.platforms.Facebook;
import com.designpattern.bridge.platforms.IPlatform;
import com.designpattern.bridge.platforms.TwitchTV;
import com.designpattern.bridge.transmissions.AdvancedLive;
import com.designpattern.bridge.transmissions.Live;

public class Main {

    public static void main(String[] args) {
        startLive(new TwitchTV());
        startLive(new TwitchTV());
        startLive(new Facebook());
    }

    public static void startLive(IPlatform platform) {
        /*System.out.println("...Aguarde!");
        Live live = new Live(platform);
        live.broadcasting();
        live.result();
         */

        AdvancedLive advancedLive = new AdvancedLive(platform);
        advancedLive.broadcasting();
        advancedLive.comments();
        advancedLive.subtitles();
        advancedLive.result();
    }
}
