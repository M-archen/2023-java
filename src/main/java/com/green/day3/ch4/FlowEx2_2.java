package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx2_2 {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);//Scanner 클래스의 객체를 생성.
        System.out.print("숫자를 하나 입력하세요 >>");
        String input=scan.nextLine();//scan.nextLine() 은 내가 입력하기까지 기다림. 입력이 되면 input으로 값을 던져줌.
        int num=Integer.parseInt(input);//문자열>>정수형으로 형변환.

        //해당값이 홀수면
        //00은 홀수입니다.
        //해당값이 짝수면
        //00은 짝수입니다.

        //예) 입력을 8로 했다.
        //8은 짝수입니다.
        if(num==0){
            System.out.printf("다른 값을 입력해 주세요.\n");
        }
        else if(num%2==0)
        {
            System.out.printf("%d 는 짝수입니다.",num);
        }
        else System.out.printf("%d 는 홀수입니다.",num);
    }


}
