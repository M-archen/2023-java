package com.green.day10.ch6;

public class MethodExam {
    void checkZero(int i){//method는 보통 void 메소드와 return method로 나뉜다.

        if(i==0){
            System.out.println("0입니다.");

        }else System.out.println("0이 아닙니다.");
    }
    int randomValFromTo(int i,int j){
        return (int)(Math.random()*(j-i+1)+i);
    }
    void scoreResultPrint(int i){
        if(i>100){
            System.out.printf("잘못된 점수입니다.\n");
        }else if(i<=100&&i>=90){
            System.out.printf("A 학점\n");
        }else if(i>=80){
            System.out.printf("B 학점\n");
        }else if(i>=70){
            System.out.printf("C 학점\n");
        }else if(i>=0&&i<70){
            System.out.printf("D 학점\n");
        }else System.out.printf("잘못된 점수입니다.\n");



    }

}
