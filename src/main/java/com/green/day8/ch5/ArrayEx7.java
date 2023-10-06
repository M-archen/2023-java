package com.green.day8.ch5;

public class ArrayEx7 {
    public static void main(String[] args) {
        //정수 10개를 저장할 수 있는 배열을 만든다.
        //0~9 값을 순차적으로 대입한다.

        int[] arr=new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;
        }
        //0번방~9번방에서 나올 수 있는 랜덤한 값을 뽑음
        while(true)
        {

           int b=(int)(Math.random()*10);
           int c=(int)(Math.random()*10);

           arr[b]=c;
           c=arr[b];

            System.out.printf("arr[%d]: %d ,arr[%d]: %d \n",arr[b],b,arr[c],c);

        }


    }
}
