package com.green.programmers.coddingtest.java;

class Solution{
    public long solution(int n, int[] times) {                  //times.length => 심사대 갯수.  n => 입국심사 기다리는사람.
                                                                //n = 전체 양 n,   시그마=times[i]전부 더한값.
        long pd=0;
        double[] copy=new double[times.length];
        for (int i = 0; i < times.length; i++) {
            copy[i]=times[i];
        }
        for (int i = 0; i < times.length; i++) {
            pd+=times[i];
        }
        for (int i = 0; i < times.length; i++) {
            pd=pd/times[i];
        }
        for (int i = 0; i < times.length; i++) {
            copy[i]=(n*(copy[i]/pd));
        }
        double Max=0;
        for (int i = 0; i < times.length; i++) {
            if(copy[i]>Max){
                Max=copy[i];
            }
        }
        return (long)Max;
    }
}

