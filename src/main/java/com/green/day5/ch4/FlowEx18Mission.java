package com.green.day5.ch4;

public class FlowEx18Mission {
    public static void main(String[] args) {

        for(int i=1;i<10;i++)
        {
            for(int l=2;l<10;l++)
            {
                System.out.printf("%d X %d = %d  ",l,i,i*l);
                if(i*l<10){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
