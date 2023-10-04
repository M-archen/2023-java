package com.green.day4.ch4;

public class CharAt {
    public static void main(String[] args) {
        String str="abcdefghijk";
        str=str.toUpperCase();//메소드(기능) 호출.
        //.은 호출,toUpperCase()대문자를 리턴.
        System.out.printf("%s\n",str);
        //스트링은 객체기때문에 속성이 있다.

        str.charAt(1);   //소괄호가 있으면 99.9%확률로 메소드.
        char result=str.charAt(1);

        System.out.println("result0 : "+str.charAt(0));
        System.out.println("result1 : "+result);
        System.out.println("result2 : "+str.charAt(2));
    }
}
