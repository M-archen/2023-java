package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args) {

        System.out.print("당신의 주민번호를 입력하세요.>>");

        //주민번호 입력받으시고
        //주민번호 확인하시고 > 여자인지 남자인디, 유효하지 않은 주민등록번호인지 출력.

        //1,3 남자
        //2,4 여성
        //나머지 잘못된주민번호.

        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();
        char result=input.charAt(7);

        switch(input.charAt(7)){
            case '1':
            case '3':
            System.out.printf("당신은 남자입니다.\n");
            break;
            case '2':
            case '4':
            System.out.printf("당신은 여자입니다.\n");
            break;
            default:
                System.out.printf("잘못된 주민번호입니다. 다시 입력하여주십시오.\n");
                break;
        }
        System.out.printf("-------------------------\n");


        int result_1=((int)result-48);
        switch(result_1){
            case 1,3:
                System.out.printf("당신은 남자입니다.");
                break;
            case 2,4:
                System.out.printf("당신은 여자입니다.");
                break;
            default:
                System.out.printf("잘못된 주민번호입니다. 다시 입력하여주십시오.");
                break;
        }

    }

}
