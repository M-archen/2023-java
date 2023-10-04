package com.green.day4.ch4;

public class RandomVal {
    public static void main(String[] args){

        double doubleVal=Math.random();//0.000~0.999 절대 1이 안나옴.
        System.out.println("doubleVal : "+doubleVal);

        // int intVal=doubleVal*10; 이 문제가 되는 이유. double이 int로 형변환되는경우 실수가 날아가기 때문에 문제가 있음.
        int intVal=(int)(doubleVal*10);
        System.out.println("intVal : "+intVal);

        int rVal=(int)(Math.random()*20);
        System.out.println("rVal : "+rVal);


    }
}
