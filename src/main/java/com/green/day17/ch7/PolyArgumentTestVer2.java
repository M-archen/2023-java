package com.green.day17.ch7;

import java.util.HashMap;
import java.util.Set;

public class PolyArgumentTestVer2 {   //다양성. 1.상속 관계에서 나타난다. 2. 타입을 알고있는 메소드만 호출할 수 있다.
                                        // 3. 부모타입은 자식 객체 주소값을 담을 수 있다. 4. 자식타입은 부모 객체 주소값을 담을 수 없다.
    public static void main(String[] args) {
        Product2 p=new Product2("제품명",1000);
        System.out.println(p);
    }
}

class PolyArgumentTestVer2_2{
    public static void main(String[] args) {
        Tv2 tv=new Tv2();
        System.out.println(tv);//name: Tv, price: 100, bonusPoint: 10;

        Computer2 com=new Computer2();
        System.out.println(com);//name: Computer, price:200, bonusPoint: 20;

        Audio2 audio=new Audio2();
        System.out.println(audio);//name: Audio, price:500, bonusPoint:50
    }
}// 객체화가 되기위한 전제조건 1. 생성자 호출이 필요하다.

class PolyArgumentTestVer2_3{
    public static void main(String[] args) {
        Buyer2 buyer=new Buyer2();
        buyer.buy(new Tv2());
        buyer.buy(new Computer2());
        buyer.buy(new Audio2());
        buyer.buy(new Tv2());
        buyer.summary();// 총 구매금액: 얼마.


    }
}
class PolyArgumentTestVer2_4{
    public static void main(String[] args) {
        Buyer2 buyer=new Buyer2();
        buyer.buy(new Computer2());
        buyer.buy(new Computer2());
        buyer.buy(new Computer2());
        buyer.buy(new Computer2());
        buyer.summary();
    }
}

class Buyer2{
    //money(정수) 저장가능
    //bonusPoint(정수) 저장가능
    //Product2 객체의 주소값 10개 저장 가능.
    private int money;
    private int bonusPoint;
    private Product2[] productArr;
    int i=0;
    protected Buyer2(){
        this.money=1000;
        this.bonusPoint=0;
        productArr=new Product2[10];//생성자를 통해서 초기화.
    }

    int sum=0;
    void buy(Product2 product2){
        if(money< product2.getPrice()){
            System.out.println("잔액이 부족합니다");
             return;
        }
        if(i>=10){
            System.out.println("그만사");
            return;
        }
        this.money=this.money-product2.getPrice();
        this.bonusPoint=this.bonusPoint+product2.getBonusPoint();
        this.productArr[i++]=product2;
        sum+=product2.getPrice();

        System.out.println(product2.getName()+"을/를 구입하셨습니다.");
        /*HashMap<Object, Object> buyItems;
        Set<String> nameSet=buyItems.keySet();
        Iterator<string> iterator-nameSet.iterator();
        while(iterator.hasNext()){
            String key=iterator.next();
            int cnt=buyItems.get(key);
            System.out.printf("%s %d대",);
        }

         */
    }
    void summary(){
        System.out.printf("%d원 ",sum);
    }


}
class Tv2 extends Product2{
    public Tv2(){
        super("Tv",100);//super() 은 부모클래스의 기본생성자 호출 즉. 여기서는 super(String name, int price)가 호출된다.
    }
}
class Computer2 extends Product2{
    public Computer2(){
        super("Computer",200);// this는 지역변수와 멤버변수의 이름이 같을 때 구별하는 용도.
    }
}
class Audio2 extends Product2{
    public Audio2(){
        super("Audio",500);
    }
}
class Product2{
    private String name;
    private int price;
    private int bonusPoint;
    protected Product2(String name,int price){//기본생성자를 따로 만들지 않았으므로 Product2(String name,int price)가 기본생성자가 된다.
        this.name=name;
        this.price=price;
        this.bonusPoint=price/10;
    }
    @Override
    public String toString() {
        return String.format("name: %s, price:%d, bonusprice:%d",name,price,bonusPoint);
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getBonusPoint() {
        return bonusPoint;
    }
}

