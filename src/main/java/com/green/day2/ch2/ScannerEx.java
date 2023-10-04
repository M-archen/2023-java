package com.green.day2.ch2;

import java.util.Scanner;

public class ScannerEx {//class 는 아파트 도면같은것.
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);//new가 Scanner을 객체화.
        //대문자로 시작하는 친구들은 주소값을 지목한다. 객체한테 접근할 수 있음.
        /*객체
        --------

        속성(값을 저장,명사)
        메소드(기능,동사)

        */
        //객체지향언어는 현실세계와 문제해결 방식이 비슷하다. 절차지향 언어는 다 뜯어고쳐야 함.
        System.out.print("두자리 정수를 하나 입력해주세요>>");
        String input=scan.nextLine();//scan.nextLine() 은 내가 입력하기까지 기다림. 입력이 되면 input으로 값을 던져줌.
        int num=Integer.parseInt(input);
        //문자열인 친구를 정수형으로 바꾸고싶을 때 Integer.parseInt(변수명).단, 문자열은 숫자로만 이루어져있어야함.
        //문자로 이루어진 정수는 사칙연산 불가능.

        //ex) 23입력. input="23", num=23.    //문자열 숫자와 정수인 숫자는 다름!!!

        System.out.println("입력내용:"+input);
        System.out.printf("num=%d\n",num);












    }
}
