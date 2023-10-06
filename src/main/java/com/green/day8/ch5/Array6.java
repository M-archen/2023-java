package com.green.day8.ch5;

public class Array6 {
    public static void main(String[] args) {
        int[] score={79,88,91,33,100,55,95,200};

        int min=score[0];
        int max=0;

        //score값 안에서 min값과 max값을 찾아 출력해주세요


        for (int i = 0; i < score.length; i++) {
            if(score[i]>=max){
                max=score[i];
            }else if(score[i]<min){
                min=score[i];
            }
        }
        System.out.printf("max: %d, min: %d",max,min);
    }
}
