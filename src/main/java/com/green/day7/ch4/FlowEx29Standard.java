package com.green.day7.ch4;

public class FlowEx29Standard {
    public static void main(String[] args) {

                //10의 배수면 & 3의배수면 짝!
                // 3의배수면 짝!
                //33,36,39, 63,66,69..  짝짝!

        for (int i = 1; i < 101; i++) {
            System.out.printf("i=%d ",i);

            int k=i%10;

            if(i%3==0)
            {
                System.out.printf("짝");
            }

            //미완.
        }

    }
}
