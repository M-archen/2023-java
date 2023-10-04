package com.green.day2.ch2;

public class CharEx {
    public static void main(String[] args){
        char ch='A';
        int val=66;

        System.out.printf("%c: %d\n",ch,(int)ch);
        System.out.printf("%c: %d\n",(char)val,val);


        char ch1='4';
        System.out.printf("%c: %d",ch1,(int)ch1);//문자가 저장될 때는 실제로는 숫자로 저장됨.
    }
}
