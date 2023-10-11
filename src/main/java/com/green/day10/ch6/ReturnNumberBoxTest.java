package com.green.day10.ch6;

public class ReturnNumberBoxTest {
    public static void main(String[] args) {
        ReturnNumberBox rnb=new ReturnNumberBox();
        // 만약  ReturnNumberBox rnb; 로 끝냈으면
        // ReturnNumberBox객체의 주솟값을 담을 수 있는 변수를 선언.
        rnb.sum(10,20);
        rnb.sum(50,290);
        System.out.println("----------");

        int r1=rnb.sum(10,20);
        int r2=rnb.sum(20,30);
        System.out.println("r1 : "+r1);
        System.out.println("r2 : "+r2);
        int r3=rnb.abs(-10);
        System.out.println("r3 : "+r3);
        System.out.println("r4 : "+rnb.abs(-99));
        System.out.println("r5 : "+rnb.abs(98));

    }
}
