package com.green.day16.ch7;

public class Animal {
    public void crying(){
        System.out.println("동물이 운다.");
    }
}
class AnimalTest2{
    public static void main(String[] args) {
        Dog dog=new Dog();
        Cat cat=new Cat();
        Bulldog bulldog=new Bulldog();
        System.out.println(bulldog instanceof Dog);
        callCrying(dog);//
        callCrying(cat);//
        callCrying(bulldog);//
    }//위에 세개는 원래 빨간불이 떳었음. 그런데,,
    public static void callCrying(Animal ani){//부모타입은 자식 객체의 주소값을 담을 수 있다!!!
        ani.crying();
        if(ani instanceof Bulldog){
        //    Bulldog bulldog=(Bulldog) ani;        다양성!!!!!
        //    bulldog.jump();
            ((Bulldog) ani).jump();
        }
    }

}
class AnimalTest3{
    public static void main(String[] args) {
        Animal ani=new Cat();
        System.out.println(ani instanceof Dog);//ani에 들어있는게 뭔지는 모르겠는데 Dog로 형변환이 가능하냐??true, 불가능>>false.
        // Dog dog=(Dog)ani; << 불가능.            //ani에 들어있는 주소값이 Dog주소값으로 형변환이 가능하냐 즉 ani는 변수, Dog는 클래스.
        System.out.println(ani instanceof Cat);     //ani에 들어있는 주소값=Cat주소값 > Cat주소값으로 형변환 가능하니 true.
        Cat cat=(Cat)ani;
        System.out.println("-끝-");

    }
}
class AnimalTest{
    public static void main(String[] args) {
        //1.부모타입은 자식 객체의 주소값을 담을 수 있다!!!( O )
        Dog d1=new Bulldog();
        Animal ani=new Bulldog();
        Animal dg=new Dog();
        Animal ct=new Cat();
        //2.자식타입은 부모 객체의 주소값을 담을 수 없다!!!( X )
        // Bulldog bd=new Dog(); <<-불가능.

        //3.타입은 알고 있는 메소드만 호출 할 수 있고
        // 호출이 된다면
        Bulldog bulld=new Bulldog();
        bulld.crying();
        bulld.jump();

        Dog dog2=new Bulldog();


        System.out.println("-끝-");
    }
}
class Dog extends Animal{
    @Override
    public void crying(){
        System.out.println("멍멍.");//오버라이딩.
    }
}
class Bulldog extends Dog{

    public void jump(){
        System.out.println("불독이 점프점프");
    }
    @Override
    public void crying(){
        System.out.println("왈!왈!");
    }
}
class Cat extends Animal{
    @Override
    public void crying(){
        System.out.println("야옹야옹.");
    }
}
