package com.green.day12.ch6;

public class Gugudan {

    void print(int tmp){

        for (int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d\n",tmp,i,tmp*i);
        }
    }

    void printFromTo(int From,int to){
        for (int i = From; i <=to ; i++) {
            print(i);
        }
    }

    void printFromTo(int From,int to,String n){
        for (int i = From; i <=to ; i++) {
            print(i);
            System.out.println(n);
        }
    }
}
