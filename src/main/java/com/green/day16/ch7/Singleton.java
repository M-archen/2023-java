package com.green.day16.ch7;

public class Singleton {// Singleton << 객체생성을 한개이상 만들지 않겠다는 의지.
    private Singleton(){}
    private static Singleton singleton; //Singleton getInstance()에서 쓸려면 객체화가 필요함. >> static을 붙임.
    public static Singleton getInstance(){
        if(singleton==null){
            singleton=new Singleton();//주소값이 없으면 새 주소값을 만들어준다.
        }
        return singleton;
    }
}

class SingletonTest{
    public static void main(String[] args) {
       // Singleton s1=new Singleton();  <-- private이 붙어서 접근 불가능. 내부에서만 접근가능하다.
        Singleton s1=Singleton.getInstance();   // <<static method. 대문자로 시작.
        Singleton s2=Singleton.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2); // instance인데 static처럼 만듦. 객체를 한번만 생성함.
    }
}

/*
        다양성을 CAKE 보다 쉽게 먹는 방법.

     1.부모타입은 자식 객체 주소값을 담을 수 있다 .

     2.자식타입은 부모 객체 주소값을 담을 수 없다 .

     3.타입은 알고있는 메소드만 호출할 수 있고, 호출이 된다면 객체 기준이다.

 */
