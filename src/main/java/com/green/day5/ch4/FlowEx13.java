package com.green.day5.ch4;

public class FlowEx13 {
    public static void main(String[] args) {
        //반복문을 사용하여 1~10을 전부 더한 값으 출력해주세요
        int k=0;
        for(int i=1;i<=10;i++)
        {
            k=k+i;
            //k+=i;
        }// int i 는 중괄호 안에서만 살아있음(스코프)가 다름.
        //괄호 밖에 작성되는 int i 와는 별개임.
        System.out.println("sum : "+k);
    }
}
