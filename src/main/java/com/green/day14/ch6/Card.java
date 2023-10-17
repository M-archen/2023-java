package com.green.day14.ch6;
 public class Card {
    String pattern;             //  전역변수
    String denomination;        // 전역변수  > 객체가 살아있는동안
                                //계속 살아있음.

    public Card(String pattern,String denomination){
        this.pattern=pattern;          //지역변수
        this.denomination=denomination;//지역변수 >> 호출이 끝나면 사라짐.
    }   //this . 은 전역변수, 메소드 호출할때 쓴다. this() 은 생성자호출할떄 쓴다.


    void printMySelf(){
        System.out.printf("%s %s %s\n",pattern,denomination);
    }
}
