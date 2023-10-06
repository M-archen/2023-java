package com.green.day8.ch5;

public class ArrayEx5 {
    public static void main(String[] args) {
        int[] score ={100,88,100,100,90};//누군가의 과목 점수.
        //구현!
        //총점 점수!
        //평균 점수!
        int total=0;
        int average=0;

        for (int i = 0; i < score.length; i++) {
            total+=score[i];
        }
        average=total/score.length;
        System.out.printf("총점:%d\n",total);
        System.out.printf("평균:%d\n",average);



    }
}
