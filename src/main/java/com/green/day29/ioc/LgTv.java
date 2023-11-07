package com.green.day29.ioc;

public class LgTv extends Tv {
   public LgTv(Speaker speaker) {
       System.out.println("--LG TV 생성--");
       this.speaker = speaker;
   }
}
