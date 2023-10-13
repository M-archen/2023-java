package com.green.day12.ch6;

import java.util.Arrays;

public class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr= {3,2,1,6,5,4};
        printArr(arr);//[3,2,1,6,5,4]
        System.out.println(Arrays.toString(arr));
        sortArr(arr);//주소값.이 없다는건 같은공간에 있다는것, 동급이라는것.
        System.out.println(Arrays.toString(arr));


        printArr(arr);//[1,2,3,4,5,6]
        System.out.println(Arrays.toString(arr));

        System.out.println("sum = "+sumArr(arr));

    }
    public static int sumArr(int[] arr){
        int num=0;
        for (int i = 0; i < arr.length; i++) {
            num+=arr[i];
        }
        return num;
    }
    public static void printArr(int[] arr){

        System.out.printf("[%d",arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.printf(", %d",arr[i]);
        }
        System.out.println("]");
    }
    public static void sortArr(int[] art){ //오름차순으로 정렬.
        /*
        for문이 두개있어야함.
        0,1 비교,1,2비교,2,3비교 3,4비교 4,5비교
         */
        for (int i = art.length-1; i >0 ; i--) {
            for (int j = 0; j < i; j++) {
                int nIdx=j+1;
                if(art[j]>art[nIdx]){
                    int tmp=art[j];
                    art[j]=art[nIdx];
                    art[nIdx]=tmp;
                }

            }
        }


    }
}
