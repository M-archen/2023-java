package com.green.day4.ch4;

public class If_3 {
    public static void main(String[] args){

        int val=(int)(Math.random()*100+1);//1~100사이의 랜덤한 값 얻을 수 있다.

        //val값이 11이면  > 11는 홀수입니다.

        if(val%2==0)
            System.out.printf("%d는 짝수 입니다.",val);
        else
            System.out.printf("%d는 홀수 입니다.",val);

    }
}
