package com.green.day7.ch5;

public class Array3MissionCopy {
    public static void main(String[] args) {

        int[] arr1={5,10,15};
        int[] arr2=new int[arr1.length+1];
        arr2=arr1;

        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("%d",arr2[i]);
        }
        arr2[3]=20;

    }
}
