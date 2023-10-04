package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args){

        int score=0;
        System.out.print("점수를 입력하세요>");
        Scanner scan=new Scanner(System.in);
        score=scan.nextInt();

        //score값이 90점보다 같거나 크면 A학점이 출력
        //score값이 80점보다 같거나 크면 B학점이 출력
        //score값이 70점보다 같거나 크면 C학점이 출력
        //나머지는 D학점;

        if(score>=90)
            System.out.printf("당신의 학점은 : A 입니다.");
        else if(score>=80)
            System.out.printf("당신의 학점은 : B 입니다.");
        else if(score>=70)
            System.out.printf("당신의 학점은 : C 입니다.");
        else{
            System.out.printf("당신의 학점은 : D 입니다.");
        }
    }
}
