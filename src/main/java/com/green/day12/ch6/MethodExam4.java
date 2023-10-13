package com.green.day12.ch6;

import java.util.Arrays;

public class MethodExam4 {

    int[] plusMap(int[] n,int m){
        int[] arr2=new int[n.length];
        for (int i = 0; i < n.length; i++) {
            arr2[i]=n[i]+m;
        }
        return arr2;
    }
    int[] plusOrigin(int[] n, int m){
        for (int i = 0; i < n.length ; i++) {
            n[i]=n[i]+m;
        }
        return n;
    }
    int[] randomValFromTo(int n,int m,int k){
        int[] arr=new int[m];
        for (int i = 0; i < m; i++) {
            arr[i]=(int)(Math.random()*(k-m+1))+m;
        }
        return arr;
    }

    public static void main(String[] args) {
        MethodExam4 me4=new MethodExam4();


        int[] arr={10,20,30,40,50};
        int[] rArr=me4.plusMap(arr,2);//원본을 건들이지 않고 새로운걸 뱉어낸다>>비파괴.


        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(rArr));


        me4.plusOrigin(arr,4);

        System.out.println(Arrays.toString(arr));
        //배열크기,랜덤min값,랜덤max값,중복허용.
        int[] rArr2=me4.randomValFromTo(10,5,20);
        System.out.println(rArr2[1]);
    }
}
