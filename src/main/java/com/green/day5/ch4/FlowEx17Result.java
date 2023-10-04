package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17Result {
    public static void main(String[] args) {

        //scanner을 이용해서 정수를 입력받는다.
        //*을 출력할 라인의 수를 입력하세요 >>

        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();//scan.nextLine() 은 내가 입력하기까지 기다림. 입력이 되면 input으로 값을 던져줌.
        int num=Integer.parseInt(input);

        for(int l=0;l<num;l++)
        {
            for(int k=0;k<=l;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
