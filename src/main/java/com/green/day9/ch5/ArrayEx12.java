package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names={"Kim", "Park", "Lee"};
        for (int i = 0; i < names.length; i++) {
            System.out.printf("names[%d]: %s\n", i ,names[i]);
        }
        //프로그래밍에서 어떤것을 쓰려면(변경하려면) 대입연산자가 필요하다.
        System.out.println(Arrays.toString(names));

        for(String str:names){//for each문.  그냥 편해서 쓴다.
            System.out.println(str);//향상된 for문.
        }//밑에것과 위에 결과가 같다.
        for (int i = 0; i < names.length; i++) {
            String str=names[i];
            System.out.println(str);
        }
    }
}
