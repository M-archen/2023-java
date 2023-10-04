package com.green.day3.ch4;
import java.util.Scanner;
public class OperatorEx32Mission {
    public static void main(String[] args)
    {   /*
        int n=-10;
        n=-n;
        System.out.println("n : "+n);
        */

        //만약에 n이 -10이었다면(음수) 콘솔에 10이 출력되어야 하고.
        //만약에 n이 10이었다면(양수) 콘솔에 10이 출력.
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();//scan.nextLine() 은 내가 입력하기까지 기다림. 입력이 되면 input으로 값을 던져줌.
        int num=Integer.parseInt(input);

        if(num>=0){
            System.out.printf("%d",num);
        }else {
            num=-num;
            System.out.printf("%d",num);
        }






    }
}
