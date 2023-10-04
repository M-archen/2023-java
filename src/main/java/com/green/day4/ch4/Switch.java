package com.green.day4.ch4;

public class Switch {
    public static void main(String[] args) {

        int val=10;

        switch(val){//val에는 보통 변수가 들어온다.
            case 1:
                System.out.println("1이다.");//break를 만날때까지 실행.
            case 2:
                System.out.println("2이다.");//2도 실행.
                break;//switch문을 빠져나옴.
            case 3:
                System.out.println("3이다.");
                break;
            default://3개 다 아닌경우.맨위에 있어도 됨.
                System.out.println("1~3이 아니다.");
                break;
        }



    }
}
