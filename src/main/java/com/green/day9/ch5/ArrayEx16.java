package com.green.day9.ch5;

import java.util.Scanner;

public class ArrayEx16 {
    public static void main(String[] args) {
        /*
        3개의 String값을 담을 수 있는 배열을 생성.
        3번 입력을받는다(문자열).
        입력받은 문자열들을 순차적으로 배열에 값을 넣는다.
        값 넣는게 종료가 되면 향상된 for문을 이용하여 저장되어있는 값들을 콘솔에 출력한다.
         */
        Scanner scan=new Scanner(System.in);
        String[] str=new String[3];
        for (int i = 0; i < str.length; i++) {
            str[i]= scan.next();
        }
        for(String k:str)
        {
            System.out.println(k);
        }

    }
}
