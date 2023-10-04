package com.green.day5.ch4;


public class FlowEx18 {
    public static void main(String[] args) {

       //중첩 for 문을 활용하여 구구단 2단 ~9단 출력.


        for(int l=2;l<10;l++)
        {
            for(int k=1;k<=l;k++)
            {
                System.out.printf("%d X %d = %d\n",l,k,l*k);
            }
        }

    }
}
