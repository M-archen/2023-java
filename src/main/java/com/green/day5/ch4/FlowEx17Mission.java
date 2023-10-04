package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17Mission {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();//scan.nextLine() 은 내가 입력하기까지 기다림. 입력이 되면 input으로 값을 던져줌.
        int num=Integer.parseInt(input);

       for(int l=0;l<num;l++)
        {
            for(int i=num-1;i>l;i--){
                System.out.print("_");
            }

            for(int i=0;i<=l;i++){
                System.out.print("*");
            }
            System.out.println();
        }
       System.out.println("------------------");

        for(int l=0;l<num;l++)
        {
            for(int i=0;i<=l;i++){
                System.out.print("*");
            }

            for(int i=num-1;i>l;i--){
                System.out.print("_");
            }

            System.out.println();
        }
        System.out.println("------------------");

    }
}
