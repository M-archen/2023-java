package com.green.day2.ch2;

public class Printf {
    public static void main(String[] args){     //String[] args <---메소드 정의.(parameter[매개변수])
        System.out.println("안녕");               //
        System.out.println("안녕");
        System.out.println("안녕");
        System.out.println("----------------");

        System.out.print("Hello\n");//\<이스케이프 문자.
        System.out.print("Hello\n");
        System.out.print("Hello\n");
        System.out.print("---------------\n");

        String name="홍길동";
        int age=23;
        char bloodType='B';
        float height=173.8f;

        //제 이름은 홍길동이고 나이는 23세이고, 혈액형은 B형이고, 키는 178.8cm입니다.
        System.out.println("제 이름은 "+name+"이고, 나이는 "+age+"세이고, 혈액형은 "+bloodType+"형이고, 키는 "+height+"cm입니다.");
        //가독성이 떨어져 많이쓰지않음.
        System.out.printf("제 이름은 %s이고, 나이는 %d세이고, 혈액형은 %c형이고, 키는 %.1fcm입니다\n",name,age,bloodType,height);
        //보통은 printf를 씀.
        System.out.printf("제 이름은 %s이고, 나이는 %s세이고, 혈액형은 %s형이고, 키는 %scm입니다\n",name,age,bloodType,height);
        // string이 float,int,char 의 상위호환이라 전부 string으로 표시해도 문제(X).
        //%s,%d,%c,%f 를 포인트라고함. 콤마(,)이후의 값이 %s,%d,%c... 에 차례대로 주입됨.






    }
}
