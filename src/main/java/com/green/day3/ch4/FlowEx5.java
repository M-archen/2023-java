package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args)
    {
        int score=0;
        System.out.print("점수를 입력하세요>");
        Scanner scan=new Scanner(System.in);
        score=scan.nextInt();

        //score값이 90점보다 같거나 크면 A학점 출력
        //score값이 80점보다 같거나 크면 B학점 출력
        //1의 자리수가 8 이상이면 +,3이하이면-,나머지는 없음(빈칸)
        //
        //예를들어 98점이면 A+
        // 83점이면 B-출력.
        char grade='C';
        char PM=' ';

        if(score>=90) {
            grade = 'A';
        }
        else if(score>=80) {
            grade = 'B';
        }
        else if(score<80) {
            grade = 'C';
        }


        if(score%10>=8||score==100){
            PM='+';
        }else if(score%10>=3)
        {
            PM='-';
        }else if(score<80){
            PM=' ';
        }

        System.out.printf("당신의 학점은 %c%c입니다.",grade,PM);

    }

}
