package com.green.day4.ch4;

import java.util.Scanner;

public class Abs {
    public static void main(String[] args){


        Scanner scan=new Scanner(System.in);
        int num= scan.nextInt();

        System.out.printf("%d는 절댓값 %d\n",num,num>=0?num:-num);
        System.out.printf("%d는 절댓값 %d",num,Math.abs(num));

    }
}
