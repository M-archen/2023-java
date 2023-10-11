package com.green.day11.ch6;

public class StarPrintTest {
    public static void main(String[] args) {
        StarPrint sp=new StarPrint();

        sp.Line(5); //*****(개행)
        sp.Line(7); //*******(개행)

        sp.square(4);
        //****
        //****
        //****
        //****
        sp.triangle(5);
        //*
        //**
        //***
        //****
        //*****
        String gender=sp.chkGenderById("011231-2117111");
        System.out.printf("%s\n",gender);

        /*
        8번째 자리의 숫자가 2,4 이면 여성
        1,3, 이면 남성 이외의 값이면 유효하지 않은 주민번호
         */

        int sum=sp.sumFromTo(4,10);
        int sum2=sp.sumFromTo(10,15);
        System.out.printf("%d %d\n",sum,sum2);
    }
}
