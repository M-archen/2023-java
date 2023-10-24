package com.green.day19.ch7;

public class AnonymousClassTest {
    public static void main(String[] args) {
        Runnable2 run=new RunRobot();
        Runnable2 run2=new Runnable2() {//위에것과 같음.만들때마다 달라지는 경우에는 익명클래스로 만들어주는 편임.
            @Override
            public void run() {
                System.out.println("하하하");
            }
        };
    }
}

interface Runnable2{//지금까지는 인터페이스는 구현부가 없기때문에 객체화를 할 수가 없다...
    void run();//public abstract 가 생략되어있음.
}
class RunRobot implements Runnable2{//class 가 interface상속 받을때에는  implements를 써야함.
    @Override
    public void run(){
        System.out.println("로봇이 달린다.");
    }
}
