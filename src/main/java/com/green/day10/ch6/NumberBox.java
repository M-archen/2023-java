package com.green.day10.ch6;

public class NumberBox {//객채는 속성과 메소드로 구성됨. 현재는 멤버필드가 없는 상태.
                        //class=문서,설명서... 놀랍게도 NumberBox가 타입임.
    void sum(int n1, int n2){
//              매개변수.
        System.out.printf("%d + %d = %d\n",n1,n2,(n1+n2));
    }
    void minus(int n1, int n2){
        System.out.printf("%d - %d = %d\n",n1,n2,(n1-n2));
    }
    void abs(int n3){
        System.out.printf("%d\n",n3<0?-n3:n3);
    }
}
