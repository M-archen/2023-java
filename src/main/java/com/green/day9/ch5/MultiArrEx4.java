package com.green.day9.ch5;

import java.util.Scanner;

public class MultiArrEx4 {
    public static void main(String[] args) {
        String[][] words={
                {"chair","의자"}
                ,{"computer","컴퓨터"}
                ,{"integer","정수"}
        };
        /*
        Q1. chair 의 뜻은?>> dmlwk
        틀렸습니다. 정답은 의자입니다.

        Q2. computer의 뜻은?>> 컴퓨터
        정답입니다.
        ....

         */
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < words.length; i++) {
            System.out.printf("%s 의 뜻은? >> ",words[i][0]);
            String answer=scan.nextLine();
            if(answer.equals(words[i][1])){
                System.out.printf("정답입니다. \n");
            }else System.out.printf("틀렸습니다. 정답은 %s 입니다.\n",words[i][1]);
        }

    }
}
