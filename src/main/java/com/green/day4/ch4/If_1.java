package com.green.day4.ch4;

import java.util.Scanner;

public class If_1 {
    public static void main(String[] args){
        //scanner을 이용하여 성별을 입력(남자,여자)
        //만약에 남자> 잘생겼다.
        //여자> 예쁘다. 출력
        //다른값 입력> 누구냐 출력.
        Scanner scan=new Scanner(System.in);
        String gender=scan.nextLine();
        if(gender.equals("남자")){//문자열 비교에는 변수.equals("문자열") 을 사용.
            System.out.printf("잘생겼다.");
        }else if(gender.equals("여자")){
            System.out.printf("예쁘다.");
        }else{
            System.out.printf("누구냐...");
        }

    }
}
