package com.green.day6.ch4;

public class FlowEx24copy {
    public static void main(String[] args) {

        int i=11;
        System.out.println("카운트 다운을 시작합니다.");
        while(i-- !=0){

            System.out.println(i);

            for(long z=0;z<5000000000L;z++){
                ;
            }
        }
        System.out.println("Launch!!");

    }
}
