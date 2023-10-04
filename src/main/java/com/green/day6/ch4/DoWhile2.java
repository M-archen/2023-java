package com.green.day6.ch4;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sum=0;
        int input=0;

        while(true) {//무한루프
            System.out.print("1~100사이의 숫자 입력(종료:0) >>");
            input=scan.nextInt();

            if(input==0){
                break;//반복문 빠져나옴.
            }
            sum+=input;

        }


    }




}
