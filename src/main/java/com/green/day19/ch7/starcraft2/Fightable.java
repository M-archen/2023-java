package com.green.day19.ch7.starcraft2;

public interface Fightable extends Movable,Attackable{// 인터페이스는 어차피 구현부가 없어서 다중상속해도 문제가 안된다.
    //Spring >> 인터페이스 : 느슨한 연결: 교체가 간편함.
    //현실 >> 인터페이스(X) : 전기를 끌어와서 피복벗기고 바로쓰는경우..
    //만약 고장나면 피복 벗기고 연결하고.. 개ziral..
    // but  콘센트가 있다면??
    // 콘센트== interface . 즉 Inter (너와 나 사이) face(얼굴) >> 중간의 연결부 역할을 한다.
}
interface Movable{
    void move(int x,int y);
}
interface Attackable{
    void attack(Unit u);
}
class Unit{
    private int currentHp;
    private int x;
    private int y;
}
class Fighter extends Unit implements Fightable{

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void attack(Unit u) {

    }
}
class FighterTest{
    public static void main(String[] args) {
        Movable movable=new Fighter();// Movable 은 부모라서 담을 수 있다.
        movable.move(10,20);

        //attack method 호출하고싶다...

        Attackable attackable=(Attackable) movable; //객체가 그 메소드를 갖고있다면 알고있는애로 형변환해줘야함.
        attackable.attack(null);
        Fighter fighter=(Fighter) movable;
        fighter.attack(null);
    }
}