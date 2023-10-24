package com.green.day19.ch7.starcraft;
import java.util.*;

class StarcraftGame{
    public static void main(String[] args) {
        List<Unit> units=new ArrayList<>();
        Unit unit=new Marine();
        unit.move(10,20);

        Unit unit2=new Tank();
        unit2.move(10,20);


    }
}
class StarcraftGame2{
    public static void main(String[] args) {
        List<Unit> units=new ArrayList<>();
        units.add(new Marine());
        units.add(new Marine());
        units.add(new Marine());
        units.add(new Tank());
        units.add(new Tank());

        moveAll(units,30,50);
        Tank.changeMode();
        Tank.changeMode();
        Unit unit1= units.get(units.size()-1);
        System.out.println(unit1);
        Tank.changeMode();


    }

    private static void moveAll(List<Unit> units, int x, int y){
        for (int i = 0; i < units.size(); i++) {
            units.get(i).move(x,y);
        }
    }
}

public abstract class Unit {

    protected int x;// protected는 같은 패키지,같은 클래스,자손 클래스 까지 접근가능.
    protected int y;
    public abstract Unit move(int x, int y);//추상메소드 . 구현부가 없는 메소드.
    public void stop(){
        System.out.println("현재 위치에 정지.");
    }
    public void setX(int x){// private 으로 묶인 변수는 setter으로 값을 넣어줌. or protected 으로 변경 but 좀 불안하긴함.
        this.x = x;
    }
    public void setY(int y){
        this.y=y;
    }
}

class Marine extends Unit {
    @Override
    public Unit move(int x, int y) {
        this.x=x;
        this.y=y;
        System.out.printf("마린이 좌표 %d, %d 로 이동\n",x,y);
        return null;
    }
    public void steamPack(){
        System.out.println("스팀팩 시전!!!");
    }
}

class Tank extends Unit{
    private static boolean siegeMode;
    @Override
    public Unit move(int x, int y) {
        this.x=x;
        this.y=y;
        System.out.printf("탱크가 좌표 %d, %d 로 이동\n",x,y);
        return null;
    }
    public static void changeMode(){
        System.out.printf("시즈모드 %b\n",siegeMode=siegeMode==true?siegeMode!=siegeMode:siegeMode!=!siegeMode);
    }
}