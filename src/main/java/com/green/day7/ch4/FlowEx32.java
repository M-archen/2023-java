package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {
        /*
        (1)square
        (2)tri
        (3)log
        원하는 메뉴(1~3)을 선택하세요 종료:0 >>

        위 내용이 계속 반복(0을 입력하기 전까지.

        if(1입력)

        선택하신 메뉴는 1번입니다.
        다시 나옴..

        무한반복
        if (4번클릭>??)
        메뉴를 잘못 선택하셨습니다.

         */


        Scanner scan=new Scanner(System.in);

        int a=0;
        while(true)
        {

            System.out.printf("(1) square\n(2) tri\n(3) log\n원하는 메뉴(1~3)을 선택하세요.(종료:0) >>");

            a= scan.nextInt();
            if(a==0){break;}
            else if(a>=1&&a<=3)
            {
                System.out.printf("당신이 고른 메뉴는 %d번입니다.\n",a);
            }else System.out.printf("메뉴를 잘못 선택하셨습니다. 다시선택해주십시오.\n");




        }
        System.out.printf("종료.");

    }
}
