package com.green.day8.ch5;

public class ArrayEx2 {
    public static void main(String[] args) {
        /*
        5개의 방을 갖고 있는 정수형 배열을 만드시고
        각 방의 1~10의 랜덤한 값을 넣어주세요.
         */
        int[] a=new int[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10 + 1);
            System.out.printf("a[%d] : %d\n",i,a[i]);
        }
    }
}
