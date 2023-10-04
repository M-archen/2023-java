package com.green.day6.ch4;

public class FlowEx24 {
    public static void main(String[] args) {

        /*
        i변수 while 을 이용하여 아래처럼 콘솔에 출력되도록 해주세요.,
        4 - I can do it.
        3 - I can do it.
        2 - I can do it.
        1 - I can do it.
        0 - I can do it.

         */
        int i=5;
        while(i>0){ //멈춰야되는 조건을 알때는 while문을 쓴다. // when while (false) >> 반복문 벗어남.

            System.out.printf("%d - I can do it.\n",--i);

        }

        int k=11;
        System.out.println("카운트다운을 시작합니다.");
        while(k-- !=0){
            System.out.printf("%d",i);
            //20억 돌도록 하자.
            for(int z=0;z<2000000000;z++){
                ;
            }

        }
        System.out.println("Launch!!");



    }
}
