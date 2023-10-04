package com.green.day2.ch2;

public class OverflowEx {
    public static void main(String[] args){

        int intVal=5;
        byte byteVal=(byte)intVal;

        System.out.printf("byteVal : %d\n",byteVal);

        int intVal2=128;
        byte byteVal2=(byte)intVal2;
        System.out.printf("byteVal2 : %d\n",byteVal2);
        //오버플로우가 발생. byte의 범위가 -128~127이기 때문에 127위로 값을 1칸 뛰어넘어 맨 아래의 값으로 1칸 이동한다.

        int intVal3=-129;
        byte byteVal3=(byte)intVal3;
        System.out.printf("byteVal3 : %d\n",byteVal3);
        //언더플로우가 발생. byte의 범위가 -128~127이기 때문에 -128아래로 값을 1칸 뛰어넘어 맨 위의 값으로 1칸 이동한다.


    }
}
