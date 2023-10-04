package com.green.day2.ch2;

public class StringEx {
    public static void main(String[] args){
        String name="Ja"+"va";//문자열이 양쪽에 하나라도 있으면 문자열 합치기가 됨.
        System.out.println(name);

        System.out.println("ja"+"va");

        System.out.println("12"+10+9);
        //"12"+10+9    ->12109
        //"12"+"10"+9   ->12109
        //12+"10"+9     ->12109

        System.out.println(12+10+9);
        //12+10+9       ->31

        System.out.println(12+name);
        //12+name       ->12java

        System.out.println("12"+name);
        //"12"+name     ->12java

        System.out.println("java"+name);
        //"java"+name   ->javajava

        System.out.println("12"+(10+9));
        //"12"+(10+9)   ->1219  10+9먼저 연산."12"문자열 .문자열+숫자=>문자열 취급으로 1219.
    }
}
