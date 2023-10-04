package com.green.day3.ch4;

import java.util.Scanner;//Scanner 클래스를 사용하기 위해 추가.

public class FlowEx2 {
    public static void main(String[] args){
        //(콘솔)숫자를 하나 입력하세요>
        //입력 기다림
        //숫자를 입력하고 엔터를 누르면
        //String 변수에 해당값이 저장될 수 있도록
        //해당 문자열> 정수형으로 형변환
        //해당 숫자가 0이라면 콘솔에 "입력하신 숫자는 0 입니다.
        //해당 숫자가 0이 아니라면 콘솔에"입력하신 숫자는 0이 아닙니다."
        Scanner scan=new Scanner(System.in);//Scanner 클래스의 객체를 생성.
        System.out.print("숫자를 하나 입력하세요 >>");
        String input=scan.nextLine();//scan.nextLine() 은 내가 입력하기까지 기다림. 입력이 되면 input으로 값을 던져줌.
        int num=Integer.parseInt(input);//문자열>>정수형으로 형변환.

        if(num==0){//만약  num 값이 0이면
            System.out.println("입력하신 숫자는 0 입니다.");
        }//만약  num 값이 0이아닌 다른 값이면
        else {
            System.out.println("입력하신 숫자는 0이 아닙니다.");
            System.out.printf("입력하신 숫자는 %d 입니다.",num);
        }

    }
}
