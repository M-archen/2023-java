package com.green.day5.ch4;

public class FlowEx16 {
    public static void main(String[] args) {
        //중첩반복문을 사용하여
        //가로 10개, 세로 5줄
        //별을 찍으시오.

        for(int i=0;i<5;i++)
        {
            for(int l=0;l<10;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------");

    }
}
