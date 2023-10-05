package com.green.day7.ch4;

public class BreakContinue2 {
    public static void main(String[] args) {
        //break를 사용할 수 있는곳:switch,반복문.

        //continue를 사용할 수 있는곳: 반복문.

        for(int i=0;i<5;i++)
        {
            for(int z=10;z<15;z++)
            {   if(z==13)break;
                System.out.printf("i:%d - z:%d\n",i,z);
            }
        }

        for(int i=0;i<5;i++)
        {
            for(int z=10;z<15;z++)
            {   if(z==13)continue;
                System.out.printf("i:%d - z:%d\n",i,z);
            }
        }

    }
}
