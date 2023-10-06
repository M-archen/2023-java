package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayToStringMission {
    public static void main(String[] args) {

        int[] arr={5,10,7,3,11};
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------");
        System.out.printf("[");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.printf("%d, ",arr[i]);
        }
        System.out.printf("%d]\n",arr[arr.length-1]);


        System.out.println("--------------");
        System.out.printf("[");
        for (int i = 0; i < arr.length; i++) {//for문의 중간에 비교문에는 가능하면 연산을 안하면 좋다.
            if(i==arr.length-1)
            {
                System.out.printf("%d",arr[arr.length-1]);
                break;
            }
            System.out.printf("%d, ",arr[i]);
        }
        System.out.printf("]\n");
        System.out.println("--------------");
        System.out.printf("[");
        for (int i = 0; i < arr.length; i++) {
            if(i<arr.length-1){
                System.out.printf("%d, ",arr[i]);
            }else{
                System.out.printf("%d",arr[i]);
            }
        }System.out.printf("]\n");
        System.out.println("--------------");

        int len=arr.length-1;
        System.out.printf("[");
        for (int i = 0; i < arr.length; i++) {//for문의 중간에 비교문에는 가능하면 연산을 안하면 좋다.
            System.out.print(i<len?arr[i]+", ": arr[i]);
        }
        System.out.printf("]\n");

        System.out.println("--------------");
    }

}
