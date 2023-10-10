package com.green.day9.ch5;

public class MultiArray {
    public static void main(String[] args) {
        int[][] arr={ //arr은 int 배열 배열 타입이고
                {100,200}, // 각 방{}들은 int 배열 타입.
                {300,400},
                {500,600},
        };//정수 배열 타입과 정수 타입은 엄연히 다른 것!!

        System.out.println(arr[0][0]);//         0       1
        System.out.println(arr[0][1]);//  0     100     200
        System.out.println(arr[1][0]);//
        System.out.println(arr[1][1]);//  1     300     400
        System.out.println(arr[2][0]);//
        System.out.println(arr[2][1]);//  2     500     600
        System.out.println("--------------");
        int[] intArr= arr[2];
        System.out.println(intArr[1]);
        System.out.println("--------------");
        System.out.printf("arr.length: %d \n",arr.length);
        System.out.printf("arr[0].length: %d \n",arr[0].length);
        /*
        int[] intArr1 = arr[0];

        int[] newIntArr={1,2,3,4};
        arr[0]=newIntArr;
         */


    }
}
