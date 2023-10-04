package com.green.day4.ch4;

import java.util.Scanner;

public class If_2 {
    public static void main(String[] args){
        //scanner을 이용하여 성별을 입력(남자,남,Man,여,여자,woman,Woman)
        //만약에 남자> 잘생겼다.
        //여자> 예쁘다. 출력
        //다른값 입력> 누구냐 출력.

        //test case-1
        Scanner scan=new Scanner(System.in);
        String gender=scan.nextLine();
        if(gender.equals("남자")){//문자열 비교에는 변수.equals("문자열") 을 사용.
            System.out.printf("잘생겼다.\n");
        }else if(gender.equals("남")){
            System.out.printf("잘생겼다.\n");
        }else if(gender.equals("man")){
            System.out.printf("잘생겼다.\n");
        }else if(gender.equals("Man")){
            System.out.printf("잘생겼다.\n");
        }else


        if(gender.equals("여자")){
            System.out.printf("예쁘다.\n");
        }else if(gender.equals("여")){
            System.out.printf("예쁘다.\n");
        }else if(gender.equals("Woman")){
            System.out.printf("예쁘다.\n");
        }else if(gender.equals("woman")){
            System.out.printf("예쁘다.\n");
        }else System.out.printf("누구냐...\n");

        System.out.println("---------------------");
        //test case-2

        if(gender.equals("남자")||gender.equals("남")||gender.equals("man")||gender.equals("Man"))
        {
            System.out.printf("잘생겼다.");
        }else if(gender.equals("여자")||gender.equals("여")||gender.equals("woman")||gender.equals("Woman"))
        {
            System.out.printf("예쁘다.");
        }else System.out.printf("누구냐..");



    }
}
