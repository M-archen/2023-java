package com.green.day6.ch4;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {

        int num=0;
        int sum=0;
        System.out.print("숫자를 입력하세요.(예:12345) >>>");
        //12345>>15
        //2233>>10
        Scanner scan=new Scanner(System.in);
        num=scan.nextInt();// int를 받을때는  nextInt() 함수를 이용.
        while(num!=0)//num이 0이 안될때까지.
        {
            int modVal=num%10;
            num=num/10;
            sum=sum+modVal;

            /*
            int modVal = num&10;
            sum=sum+modVal;

            num=num/10;
             */
        }
        System.out.printf("결과 : >>%d",sum);
    }
}
