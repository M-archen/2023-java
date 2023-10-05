package com.green.day6.ch4;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int input=0;
        int answer=(int)(Math.random()*100)+1;//100~1

        System.out.println("answer : "+answer);
        while(true)
        {
            System.out.print("1과 100 사이의 정수를 입력사ㅔ요 >>");
            input=scan.nextInt();
            if(input==answer)
            {
                break;
            }
            System.out.println(input<answer?"Up":"Down");
        }
        System.out.println("끝!");


    }
}
