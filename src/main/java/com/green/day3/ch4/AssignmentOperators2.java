package com.green.day3.ch4;

public class AssignmentOperators2 {
    public static void main(String[] args){

        int r1=0,n1=0,a1=0;
        r1=++n1;//읽기,쓰기. ++이 앞에 있으면 쓰기 먼저하고 읽기. n1값 먼저 올리고 r1에 복사.
        ++a1;//쓰기,읽기(X)

        System.out.printf("r1 : %d, n1 : %d, a1 : %d\n",r1,n1,a1);

        int r2=0,n2=0,a2=0;
        r2=n2++;//++이 뒤에 있으면 읽기 먼저하고 쓰기. r2에 먼저 복사하고 n2값 올림.
        a2++;//쓰기만 있으면 앞에 붙이던,뒤에 붙이던 상관이 없다.

        System.out.printf("r2 : %d, n2 : %d, a2 : %d\n",r2,n2,a2);


    }
}
