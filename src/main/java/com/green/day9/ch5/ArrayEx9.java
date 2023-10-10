package com.green.day9.ch5;

public class ArrayEx9 {
    public static void main(String[] args) {
        int[] code={-4,-1,3,6,11};
        int[] arr=new int[10];
        /*
        arr각 방에 code에 있는 값만 랜덤하게 넣어주세요.
         */

        for (int i = 0; i < arr.length; i++) {
        int k=(int)(Math.random()*5);
        arr[i]=code[k];
        }

        System.out.printf("%d %d %d %d %d %d %d %d %d %d",arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7],arr[8],arr[9]);
    }
}
