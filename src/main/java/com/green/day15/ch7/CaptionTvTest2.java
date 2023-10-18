package com.green.day15.ch7;
class Tv2{
    boolean power;
    int channel;

    void power(){power=!power;}
    void channerlup(){channel++;}
    void channelDown(){channel--;}
}


class CaptionTv2 extends Tv2{
    int channel;
    boolean caption;
    void displayCaption(String text){
        if(caption){
            System.out.println(text);
        }
    }
    void printParentChannel(int channel){//1. Tv2 channel   2.ct2 channel,      3.옆에있는 printParentChannel(int 'channel');
        System.out.printf("parent-channel: %d\n",super.channel); //this. <<나의  란 뜻  내가 채널을 갖고있으면 나의것을씀(지역변수x). 만약에 나한테 없으면 올라감.
    }
}
public class CaptionTvTest2 {
    public static void main(String[] args) {
        CaptionTv2 ctv=new CaptionTv2();
        ctv.channel=10;
        ctv.channerlup();
        System.out.printf("ctv.channel : %d\n",ctv.channel);
        ctv.printParentChannel(35_5_5_555_5);
    }
}
