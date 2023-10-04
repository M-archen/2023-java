package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx10 {
    public static void main(String[] args) {
        int score=0;
        char grade='F';

        System.out.print("당신의 점수를 입력하세요. >>");
        Scanner scan=new Scanner(System.in);
        String tmp=scan.nextLine();
        score=Integer.parseInt(tmp);//int형으로 변환.

        //switch를 사용
        //90점 이상은 "당신의 학점은 A입니다"
        //....
        //70점 이상은 "당신의 학점은 C입니다.
        //나머지는 D

        int a=(score)/10;

        switch(a) {
            case 10, 9:
                System.out.println("당신의 학점은 A입니다.");
                break;
            case 8:
                System.out.println("당신의 학점은 B입니다.");
                break;
            case 7:
                System.out.println("당신의 학점은 C입니다.");
                break;
            default:
                System.out.println("당신의 학점은 F입니다.");

        }
    }
}
