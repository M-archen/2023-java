package com.green.programmers.coddingtest.java;
/*
대소문자 바꿔서 출력하기
문제 설명
영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.

제한사항
1 ≤ str의 길이 ≤ 20
str은 알파벳으로 이루어진 문자열입니다.
입출력 예
입력 #1

aBcDeFg
출력 #1

AbCdEfG

 */
import java.util.Scanner;
public class ChangeBigSmall {
    public class Solution {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); // 꼭 외워두기. 스캐너.
            String a=sc.next(); // 스트링 받을때까지 대기.
            for(int i=0;i<a.length();i++) // alpha.length() 는 alpha 의 string 숫자를 받아 int로 변환.
            {
                int tmp=a.charAt(i);// tmp 변수 선언 및 string변수인 alpha를 charAt함수를 통해 각각 입력받음.
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
}
