package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayRandomMission {
    public static void main(String[] args) {
        int[] a = new int[5];

        for (int i = 0; i < a.length; i++) {

            a[i]=(int)(Math.random()*10+1);

            for (int j = 0; j < i; j++) {
                if(a[i]==a[j]) {
                    i--;
                    break;//break가 없어도 작동은 하지만 break로 더이상 비교를 하지 않게 하기 위하여 break를 쓴다.
                }
            }
            System.out.printf("a[%d] : %d\n",i,a[i]);
        }
        System.out.println("-------------");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d] : %d\n",i,a[i]);
        }

        //Method
        System.out.println(Arrays.toString(a)); //Arrays.toString() Method는 배열이 가진 원소를 가로로 나열해준다.

        System.out.println("-------------");

        
        
        
    }
}
