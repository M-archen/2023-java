package com.green.day7.ch4;

public class BreakContinue {
    public static void main(String[] args) {
        //break를 사용할 수 있는곳:switch,반복문.

        //continue를 사용할 수 있는곳: 반복문.

        for(int i=0;i<10;i++)
        {
            System.out.println(i);
            break; //반복문에서  break를 만나면 가장 가까운 반복문 하나를 빠져나옴,
        }
    }
}
