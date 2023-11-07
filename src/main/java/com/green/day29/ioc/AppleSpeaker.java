package com.green.day29.ioc;

public class AppleSpeaker implements Speaker {
    private Woofer woofer;

    public AppleSpeaker(Woofer woofer) {
        this.woofer = woofer;
    }

    public void sound() {
        System.out.println("애플 스피커: 스티브!! 잡스!!");
        woofer.soundBase();
    }
}
