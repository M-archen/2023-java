package com.green.day5.ch4;

public class FlowEx12 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
        }
        System.out.println("-------------");

        for(int i=0;i<5;i++){
            System.out.print(i);
        }
        System.out.println();
        System.out.print("-------------");
        System.out.println();



        for(int i=0;i<5;){// int i=0;i<5 수정금지. 12345 찍히도록 수정.
            ++i;
            System.out.print(i);
        }
        System.out.println();
        System.out.print("-------------");
        System.out.println();


        for(int i=0;i<5;i++){// int i=0;i<5 수정금지. 100 101 102 103 104 찍히도록 수정.
            System.out.print(i+100);
            System.out.print(" ");
        }
        System.out.println();
        System.out.print("-------------");
        System.out.println();


        for(int i=92;i<97;i++){// int i=92 수정금지, ***** 찍히도록 수정.

            System.out.print("*");
        }
        System.out.println();
        System.out.print("-------------");
        System.out.println();


        for(int i=6;i>0;i--){// int i=6 수정금지, ****** 찍히도록 수정.

            System.out.print("*");
        }
        System.out.println();
        System.out.print("-------------");


    }
}
