package com.green.day13.ch6;

public class VarArgEx {
    public static void sum(int...n){
        System.out.println(n.length);
        int sum_2=0;
        for (int i = 0; i < n.length; i++) {
            sum_2+=n[i];
        }
        System.out.println(sum_2);
    }

    public static void main(String[] args) {
        sum(10,20);
        sum(10,20,30);
        sum(11,12,13,14,15);
        sum(12312,123131425,124351,24124124,212423,4123422,124124,1412224,124234212,4124,243,12,1,31,31,13,1131,3,13,11,31,31,312,3,1,31,1,231,23,1,3,13,12,31,2,3132);
    }
}
