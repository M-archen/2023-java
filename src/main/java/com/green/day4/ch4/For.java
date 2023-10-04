package com.green.day4.ch4;

public class For {
    public static void main(String[] args){
        //첫번째: 초기화공간
        //두번째: 반복여부 체크
        //세번째: 증감식
        //실행순서//
        //    1.↓  2.↓ 4.↓
        for(int i=0;i<5;i++){
            System.out.println("안녕");//3.←
        } //1 2 3 4 2 3 4 2 3 4 2 3 4.... (2번이 false가 되는데까지.)
        System.out.println("---끝---");

        int j=0,l=0;
        for(;j<10&&l<10;){
            System.out.print("j = "+(++j));//j값을 먼저 증가시킨 뒤에 출력.
            System.out.println(", l = "+(l++));//출력을 먼저하고 l값을 증가시킴.
        }


    }
}
