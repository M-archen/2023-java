package com.green.day6.ch4;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int input=0;
        int answer=(int)(Math.random()*100)+1;// 1~100

        /*
        while문을 이용하여

        입력: 1~100 사이의 정수를 입력하세요

         */
        System.out.print("1~100사이의 숫자 입력>>");
        do{//무한루프

            input=scan.nextInt();




            if(input>answer){
                System.out.printf("down");
            }else if(input<answer) System.out.printf("Up");


        }while(input==answer);

    }
}
