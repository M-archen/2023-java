package com.green.day29.ioc;

public class HarmanSpeaker implements Speaker {
    private Woofer woofer;
    public HarmanSpeaker(Woofer woofer)
    {
        this.woofer = woofer;
    }
    public void sound() {
        System.out.println("하만 스피커: 응애!! 응애!! 응애!!");
        woofer.soundBase();
    }
}
