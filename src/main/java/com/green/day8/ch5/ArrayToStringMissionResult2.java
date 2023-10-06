package com.green.day8.ch5;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayToStringMissionResult2 {
    public static void main(String[] args) {
        int[] arr={5,10,7,3,11,100};
        System.out.println(Arrays.toString(arr));
        int len=arr.length;

        System.out.println("----------");
        System.out.printf("[");
        for (int i = 0; i < len; i++) {
            if(i!=0){
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println("]");
    }
}
