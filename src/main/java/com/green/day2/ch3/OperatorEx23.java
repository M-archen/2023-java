package com.green.day2.ch3;

public class OperatorEx23 {
    public static void main(String[] args){

        String s1="Hello",s2="Hello";
        String s3=new String("Hello");

        System.out.printf("%s==%s : %b\n",s1,s2,s1==s2);// 같은거 같지만 String s1(레퍼런스 변수) 의 비교는 '주소'값으로 비교.
        System.out.printf("%s==%s : %b\n",s1,s3,s1==s3);
        System.out.printf("%s.equals(%s) : %b\n",s1,s3,s1.equals(s3));
        System.out.printf("%s.equals(%s) : %b\n",s3,s1,s3.equals(s1));

        //문자열의 비교는equals(변수명) 으로 한다.

    }
}
