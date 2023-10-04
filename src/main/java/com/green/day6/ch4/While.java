package com.green.day6.ch4;

public class While {
    public static void main(String[] args) {
        //While은 반복문입니다.
        for(int i=0;i<10;i++)//몇번 돌 지 알때는 for문 쓰고
        {
            System.out.println("for-" + i);

        }
        System.out.println("------------------");

        int i=0;//while문은 변수선언을 안에서 함.
        while(i<10){ //멈춰야되는 조건을 알때는 while문을 쓴다.
            System.out.println("while-" + i);
            i++;// while문은 증감식이 안에있음
        }
    }
}
