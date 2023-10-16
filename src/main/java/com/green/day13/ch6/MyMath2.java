package com.green.day13.ch6;

public class MyMath2 {//클래스는 문서. 객체화 해야 진짜임.
    static int num;
    static int staticNum;//static이 붙으면 다른메모리 영역에 들어간다.
     //static 붙은 친구는 공간이 하나다. (MyMath2,MyMath3 다른애. 객체생성하고 상관X)
     //staticNum << 약간 공용변기느낌...

    static void print(){//가능한 한 스태틱을 붙이자.
        System.out.printf("staticNum : %d\n",staticNum);
    }// static 메서드는 인스턴스 변수를 사용 할 수 없다.
    //인스턴스 변수 >> 4열에  num 같은애. (객체화 해야함)
    static void print2(){
        System.out.printf("staticNum : %d, num : %d\n",staticNum,num);//반대는 가능.
    }
}
