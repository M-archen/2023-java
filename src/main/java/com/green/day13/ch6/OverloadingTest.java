package com.green.day13.ch6;

public class OverloadingTest {// 같은 클래스 안에서 똑같은 이름의 메소드를 여러개 만들 수 있다= 오버로딩.
    public static void main(String[] args) {
        System.out.println(10.2D);
    }
    void print(){}
    void print(int n){}
    void print(int n,int n1){}

    //void print(int n2,int n3){} << 안됨.

    void print(int n1,String str2){}

    void print(String str2,int n1){}

}
