package com.green.day10.ch6;

public class TvTest3 {
    public static void main(String[] args) {//<<얘도 메소드.
        Tv tv1=new Tv();

        Tv tv2=tv1;

        System.out.printf("tv1.channel: %d\n", tv1.channel);
        tv1.channelUp();
        tv1.channelUp();
        System.out.printf("tv1.channel: %d\n", tv2.channel);

    }
}
/*
        Stack메모리 영역----------------------------Heap메모리영역
                                |
     First In, Last Out.        |           First In, First Out
                                |
       |    ↑    |              |       -----------------------
       |---------|              |         ->    | 3  | 2  |  1 |  ->
       |    3    |              |       -----------------------
       |---------|              |
       |    2    |              |
       |---------|              |
       |    1    |              |
       |_________|              |









 */
