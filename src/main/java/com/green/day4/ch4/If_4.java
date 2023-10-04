package com.green.day4.ch4;

public class If_4 {
    public static void main(String[] args){
        //50~200사이의 랜덤한숫자.
        //100 이하면 그 값의 *2 결과값.
        //100 초과면 그 값의 +10 결과값.

        double doubleVal=Math.random();
        int Ran=(int)((doubleVal)*151)+50;


        if(Ran<=100){
            System.out.printf("%d",Ran*2);
        }else System.out.printf("%d",Ran+10);

    }
}
