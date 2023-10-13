package com.green.day12.ch6;

public class GugudanTest {
    public static void main(String[] args) {
        Gugudan gugudan=new Gugudan();

        gugudan.print(4);//4단 구구단 콘솔에 출력.
        /*
        4 x 1 = 4
        4 x 2 = 8
        ....
         */
        gugudan.print(5);

        gugudan.printFromTo(4,7);//4단~7단까지 출력
        gugudan.printFromTo(3,7);//3단~7단까지 출력
        gugudan.printFromTo(3,6,"-----");
    }

}
