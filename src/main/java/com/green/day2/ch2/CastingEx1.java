package com.green.day2.ch2;

public class CastingEx1 {
    public static void main(String[] args){
        double d=85.4;
        int score=(int)d;
        System.out.println("score : "+score);// 실수는 정수를 저장가능.
        System.out.println("d : "+d);


        byte b1=127;
        short s1=(short)b1;
        int i1=s1;

        float f1=i1;//문제(X) 지수표현으로 저장하기 때문에 더 큰 값을 저장가능하다.
        int i2=(int)f1;


    }
}
