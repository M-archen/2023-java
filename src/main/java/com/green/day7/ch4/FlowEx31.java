package com.green.day7.ch4;

public class FlowEx31 {
    public static void main(String[] args) {
        //0~10까지 반복(11번 반복
        //3의 배수는 (0포함 출력이 안되도록 해주세요

        for(int i=0;i<=10;i++)
        {   if(i%3==0)continue;
            System.out.printf("%d\n",i);
        }
    }
}
