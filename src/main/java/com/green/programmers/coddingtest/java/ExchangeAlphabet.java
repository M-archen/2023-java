package com.green.programmers.coddingtest.java;

import java.util.Scanner;
// 입력:ABCDEFghijklmnop
// 출력:abcdefGHIJKLMNOP

//해결방법.
/*
 1.스트링 입력받음.
2.string을 char을 각각 입력받음
3.입력받은 char을 int로 변환
4.변환된 char을 반복문을 통하여 분류
5.즉시 출력.
 */
public class ExchangeAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 꼭 외워두기. 스캐너.
        String alpha=sc.next(); // 스트링 받을때까지 대기.
        for(int i=0;i<alpha.length();i++) // alpha.length() 는 alpha 의 string 숫자를 받아 int로 변환.
        {
            int tmp=alpha.charAt(i);// tmp 변수 선언 및 string변수인 alpha를 charAt함수를 통해 각각 입력받음.
            if(65<=tmp&&tmp<=90)//만약 tmp가 소문자면
            {
                tmp+=32; // tmp에 32를 더해줌(대문자로 변환[아스키 코드 상으로 +32 해줌.])
                System.out.printf("%c",(char)tmp);//즉시출력(char 형변환)
            }else if(97<=tmp&&tmp<=122)//만약 tmp가 대문자면
            {
                tmp-=32;//tmp에 32를 빼줌(소문자로 변환[아스키 코드 상으로 -32 해줌.])
                System.out.printf("%c",(char)tmp);//즉시출력
            }
        }

    }
}
