package com.green.programmers.coddingtest.java;

import java.util.Scanner;
//문제설명
/*

두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다.
입출력 예와 같이 str1과 str2을 이어서 출력하는 코드를 작성해 보세요.

입력 #1
apple pen
출력 #1
applepen
입력 #2
Hello World!
출력 #2
HelloWorld!
 */

//해결방법

//애초에 스페이스바로 두개의 string이 구분지어지기 때문에 스페이스바는 어떤 string에도 입력되어지지 않는다.
//따라서 a b string을 이어서 출력해주면 된다.
public class StringGlue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.printf("%s%s",a,b);
    }
}
