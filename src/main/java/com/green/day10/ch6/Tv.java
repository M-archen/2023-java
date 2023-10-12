package com.green.day10.ch6;

public class Tv {//     클래스              객체(Object)=Instance
                 //     ---------------------------------------
                 //     문서
                 //     설계도             아파트,Tv
                 //     설명                  제품
    //-------멤버필드,속성,property-----
    String color;
    boolean power;
    int channel;

    //-------멤버메소드,메소드--------
    // 리턴타입 메소드명 파라미터
        void    power       ()      {power=!power;}
    //리턴타입  메소드명    파라미터
    //메소드를 정의했다 라고 표현함.
    //리턴타입,메소드명,파라미터를 메소드의 선언부.{power=!power;}를 구현부 라고 함.
    //선언부,구현부 라고 말했을때 적어도 어느부분을 말하는지는 알아야함.
    //호출할때는 선언부만 적음.+
    void channelUp(){channel++;}
    void channelDown(){channel--;}

}
