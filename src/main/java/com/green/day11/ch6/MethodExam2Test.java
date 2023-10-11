package com.green.day11.ch6;

public class MethodExam2Test {
    public static void main(String[] args) {
        MethodExam2 me2= new MethodExam2();
        String r1=me2.scoreResultOpt(100);
        System.out.printf("%s\n",r1);
        me2.scoreResultOpt(90);
        /*
        100초과 0 미만은 정수를 확인해주세요 라는 값이 리턴
        A학점B학점C학점D학점
        근데, A학점 8점이상+ 3점이하- 나머지 0
        d학점은 그냥 d학점.
         */
        String season=me2.getSeason(10);
        System.out.printf("%s",season);

    }
}
