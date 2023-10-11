package com.green.day10.ch6;

public class TvTest {
    public static void main(String[] args) {
        //메인메소드는 모든 소프트웨어의 시작점!. ex)우주의 빅뱅.
        //원래는 프로젝트에서 메인메소드는 1개.
        String str=new String("dd");
        //Tv tv3=str;

        Tv tv1=new Tv();//어떤 클래스를 객체화 하고싶다. new 클래스명 (); <<객체생성.
        //Tv 객체의 주소값만 받고싶다.
        tv1.channel=10;
        //주소값 . 명령
        tv1.power=false;
        tv1.color="빨간색";
        //속성은 값을 저장하기위해서 한다 << 왜?? << 나중에 빼기 위해서.
        Tv tv2=new Tv();//new 라는것은 새로운 존재를 만들었다는것이므로 서로 다른것.
        tv2.channel=20;

        //promotive type만 default값이 있다. boolean>>false int>>0 레퍼런스변수>>null
        System.out.println("tv1==tv2 >>"+(tv1==tv2));
        System.out.println("tv1.channel: "+tv1.channel);
        System.out.println("tv1.power: "+tv2.power);
        System.out.println("tv1.color: "+tv1.color);
        System.out.println("------------------------------");
        System.out.println("tv2.channel: "+tv2.channel);
        System.out.println("tv2.power: "+tv2.power);
        System.out.println("tv2.color: "+tv2.color);//null 값이



    }
}
