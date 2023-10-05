package com.green.day7.ch4;

public class FlowEx30 {
    public static void main(String[] args) {

        //반복문사용

        int sum=0,i=0;
        //i값이 증가가 되면서 sum에 중첩으로 더하기됨.
        //sum값이 100초과가 되는 시점의 i값.
        while(true)
        {
            ++i;
            sum=sum+i;
            if(sum>100){
                System.out.printf("%d",i);
                break;
            }
        }
    }
}
