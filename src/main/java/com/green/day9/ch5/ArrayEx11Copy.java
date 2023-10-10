package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx11Copy {
    public static void main(String[] args) {
        final int LEN = 10;
        int[] numArr = new int[LEN];
        int[] cntArr = new int[LEN];

        /*
        numArr각 방에 0~9 사이의 랜덤값을 대입한다 중복허용
        numArr 각 방의 값도 출력
        cntarr의 0번 방은 0의 개수, 1번 방은 1의 개수count값을 넣는다.
        0~9의 개수를 출력.
         */
        for (int i = 0; i < numArr.length; i++) {
            int Ran = (int)(Math.random() * 10);
            numArr[i] = Ran;
            cntArr[Ran]++;
            System.out.printf("numArr[%d]:%d , ",i,numArr[i]);
        }
        System.out.println(Arrays.toString(cntArr));
    }
}
