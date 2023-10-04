package com.green.day4.ch4;

public class RandomValMission {
    public static void main(String[] args){

        double doubleVal=Math.random();//0.000~0.999 절대 1이 안나옴.
        int intVal=(int)(doubleVal*6+5);//형변환 2번해서 퍼포먼스 상으로 별로 안좋음.

        // 좀 더 좋은 코드 //
        //int intVal=(int)(Math,random()*6)+5;   형변환 한번만 하면 됨.
        System.out.println("intVal : "+intVal);

        int Ran=(int)((doubleVal)*10+14);
        System.out.println("Ran : "+Ran);
    }
}
