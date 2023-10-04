package com.green.day6.ch4;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sum=0;
        int input=0;

        do// 최초 한번은 실행됨.
        {
            System.out.print("1~100사이의 숫자 입력(종료:0) >>");
            input=scan.nextInt();
            sum+=input;

        }while(input!=0);
        System.out.println("끝!!");// 근데 잘 안씀.


    }




}
