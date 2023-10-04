package com.green.day2.ch2;

public class PrimitiveType {
    public static void main(String[] args){
        //논리형
        boolean test=true, test2=false;
        //실제로 변수를 선언하는 일은 거의 없고 비교연산자의 결과타입으로 나오는게 논리형이다.
        //값은 true,false 둘중 하나

        //문자형
        char ch='a',ch2='가';

        //정수형
        byte b1=1;   //1 byte|
        short b2=10; //2 byte| ---\   저장 할 수 있는 크기가 서로 다름.
        int b3=100;  //4 byte| ---/   cpu처리 방식때문에 4byte가 제일빠름.
        long b4=1000;//8 byte|

        //64bit (8byte)

        //실수형
        //실수 ex(10.1, 2.3, 100.42 등등은 무조건 double타입)
        float f1=10.1f;//빨간색 뜨는 이유(리터럴 타입이 맞지 않아서.)[10.1은 double타입이고 변수는 float으로 선언했기때문]
        float f2=10.1f,f3=10.1F;//변수를 선언 할 때 부터 float에 맞춰서 선언.
        float f4=(float)10.1;//강제 형변환.(위에것과 다르게 연산을 한번 더 거친다.)
        double d1=10.1, d2=10.1d, d3=10.1D;
        //10.1f 같이 리터럴을 직접 쓸 수 있을때는 먼저 선언. BUT
        float f5=(float)d1; //이와같이 리터럴을 직접 쓸 수 없을때는 강제 형변환을 거친다.


    }
}
