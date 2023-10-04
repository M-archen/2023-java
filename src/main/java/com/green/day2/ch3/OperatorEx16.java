package com.green.day2.ch3;

public class OperatorEx16 {
    public static void main(String[] args){
        /*float pi=3.141592;*/
        //오류 발생. 리터럴은 double형으로 간주하기 때문에 형변환이 필요함.

        float pi=3.141592f;
        int pro1=(int)(pi*1000);
        System.out.println("pro1 : "+pro1);

        float pro2=pro1/1000f;
        /*float pro2=pro1*0.001f; 이 위 문장보다 빠름.(곱하기가 나누기보다 연산속도가 빠르다.*/
        System.out.println("pro2 : "+pro2);

        System.out.println("one : "+(int)(pi*1000)*0.001);


    }
}
