package com.green.day29.ioc;

public class SamsungTv extends Tv {
    public SamsungTv(Speaker speaker) {
        System.out.println("--Samsung TV 생성--");
        this.speaker = speaker;
    }
}
