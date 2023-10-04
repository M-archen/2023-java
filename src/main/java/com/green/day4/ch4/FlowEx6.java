package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args) {

        System.out.print("현재 월을 입력하세요 >>");

        Scanner scan=new Scanner(System.in);
        int mon=scan.nextInt();

        //switch문으로 해결.
        //mon값이 3~5 사이면 현재의 계절은 봄입니다.
        //6~8 여름,9~11 가을,12~2 겨울.

        switch(mon){//val에는 보통 변수가 들어온다.
            case 3:
            case 4:
            case 5:
                System.out.println("현재의 계절은 봄입니다.");
                break;
            case 6,7,8:
                System.out.println("현재의 계절은 여름입니다.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("현재의 계절은 가을입니다.");
                break;
            default:
                System.out.println("현재의 계절은 겨울입니다.");
                break;

        }
    }
}
