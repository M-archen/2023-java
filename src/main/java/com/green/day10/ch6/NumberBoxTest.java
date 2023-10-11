package com.green.day10.ch6;

public class NumberBoxTest {
    public static void main(String[] args){
        //NumberBox(); 만 했으면 약간 낙동강 오리알 신세. 따라서 주소를 저장할 변수를 적어줘야함.
        NumberBox nb1;//nb1은 레퍼런스 변수고 NumberBox의 객체주소값만 담을 수 있다.
        nb1=new NumberBox();//new:객체생성, new NumberBox()가 객체의 주소값이 되어 nb1으로 복사.

        nb1.sum(10,20);
        nb1.sum(30,40);//보내는 값을 argument라고 부름(인자,인수)

        nb1.minus(40,20);//메소드를 호출했다.
        nb1.abs(-1);
    }
}
