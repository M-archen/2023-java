package com.green.day15.ch7;

public class Parent {
    public Parent(){
        super();//Parent의 부모는 Object 객체.
    }
    public Parent(int d){
        this.age=d;
    }
    int age;
}
class Child extends Parent {
    public Child(){
        super();//부모의 생성자 호출. 바로 위에있는 부모의 주소값이 super의 '상수'(변경불가)에 저장됨.
        age=100;
    }

    void play(){
        System.out.println("놀자~");
    }
}
class Child2 extends Parent {
    void junp(){
        System.out.printf("아이가 %d살에 점프를 했다.",age);
    }
}
class Main{
    public static void main(String[] args) {
        Child cd=new Child();
        cd.age=10;
        cd.play();

        Child2 cd2=new Child2();
        cd2.age=2;
        cd2.junp();
    }
}