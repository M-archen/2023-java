package com.green.day10.ch6;

public class MethodExamTest {
    public static void main(String[] args) {
        MethodExam me=new MethodExam();
        me.checkZero(10);//0이 아닙니다
        me.checkZero(19);
        me.checkZero(0);//0입니다.

        int r=me.randomValFromTo(10,100);//10~100랜덤값 리턴
        System.out.println(r);

        me.scoreResultPrint(101);//잘못된 점수입니다
        me.scoreResultPrint(100);//a
        me.scoreResultPrint(90);//a
        me.scoreResultPrint(89);//b
        me.scoreResultPrint(80);//b
        me.scoreResultPrint(79);//c
        me.scoreResultPrint(69);//d
        me.scoreResultPrint(-1);//잘못된 점수입니다.

    }

}
