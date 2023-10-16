package com.green.day13.ch6;

public class MyMathTest2 {
    public static void main(String[] args) {
        MyMath2 mm2=new MyMath2();
        mm2.num=10;
        mm2.staticNum=30;
        System.out.printf("mm2.num : %d, staticNum : %d\n",mm2.num,mm2.staticNum);

        MyMath2 mm2_2=new MyMath2();
        mm2_2.num=100;
        mm2.staticNum=50;
        System.out.printf("mm2.num : %d, staticNum : %d\n",mm2_2.num,mm2_2.staticNum);

        //mm.2staticNum <<이렇게 접근해도 되기는 하는데
        MyMath2.staticNum=100; // <<이게 맞음.
    }
}
