package com.green.day17.ch7;

public class PolyArgumentTest {
    public static void main(String[] args){
       // Product p=new Product();//안되어야함
        //System.out.println(p);
        Product p2=new Product(100);
        //price에 100이ㅣ 저장되어야 하고 bonus에 price의 10%인 10이 저장되어야 한다.
        System.out.println(p2);

        Product p3=new Product(200);
        //price에 200이ㅣ 저장되어야 하고 bonus에 price의 10%인 20이 저장되어야 한다
        System.out.println(p3);

        Tv tv=new Tv();
        System.out.println(tv);//Tv, price:100, bonusPoint:10;
        //price에는 100이 저장 bonuspoint에는 10이 저장.

        Computer computer=new Computer();
        System.out.println(computer);
        //Computer, price:200, bonusPrice:20;
        int price=computer.getPrice();
        int bonusPrice=computer.getBonusPrice();
        System.out.println(price);
        System.out.println(bonusPrice);

    }
}
class PolyArgumentTest2{
    public static void main(String[] args) {
        Buyer buyer=new Buyer();
        System.out.println(buyer);//money:1000 ,bonus point:0
        buyer.buy(new Tv()); //price:100
        buyer.buy(new Computer());//price:200
        buyer.buy(new Tv());
        System.out.println(buyer);
        buyer.buy(new Tv());
        System.out.println(buyer);
        buyer.buy(new Tv());
        System.out.println(buyer);
        buyer.buy(new Tv());
        System.out.println(buyer);
        buyer.buy(new Tv());
        System.out.println(buyer);
        buyer.buy(new Tv());
        System.out.println(buyer);
        buyer.buy(new Tv());
        System.out.println(buyer);
        buyer.buy(new Tv());
        System.out.println(buyer);
        buyer.buy(new Tv());
        System.out.println(buyer);

        //product배열타입  new Tv, new Computer 주소 들어감.



        //buyer money가 부족하면  "잔액부족" money 값 마이너스 처리X
        //잔액이 부족하지 않으면 Tv를 구입하셨습니다.
        //> money 마이너스 처리, bonusPoint 플러스 처리.
    }
}
class Buyer{
    private int money;
    private int bonusPoint;
    public Buyer(){
        this.money=1050;
        this.bonusPoint=0;
    }

    @Override
    public String toString() {
        return String.format("money: %d, bonusPoint: %d",money,bonusPoint);
    }


    public void buy(Product product){
        if(money<product.getPrice()){
            System.out.println("잔액부족");
            return;
        }
        System.out.printf("%s ",product);
        System.out.printf("price: %d ,",product.getPrice());
        System.out.printf("bonusPoint: %d\n",product.getBonusPrice());
        this.money=this.money-product.getPrice();
        this.bonusPoint=this.bonusPoint+product.getBonusPrice();
        System.out.printf("%s을/를 구입하셨습니다.",product);
    }

}

class Product{
    public final static int MIN_MONEY=0;

    private int price;
    private int bonusPoint;
    protected Product(int price){//같은 패키지안에서는 객체화가 됨.(protected.)
        this.price=price;
        this.bonusPoint=(int)(price*0.1);
    }

    @Override
    public String toString() {
        return String.format("price: %d, bonusPoint: %d",price,bonusPoint);
    }
    int getPrice(){
        return price;
    }
    int getBonusPrice(){
        return bonusPoint;
    }
}
class Tv extends Product {
    public Tv() {
        super(100);
    }

    public String toString() {

         return "Tv";
    //    return "Tv:"+super.toString(); <<이런것도 가능하다.
    }
}

class Computer extends Product{
    public Computer(){
        super(200);
    }
    public String toString() {
        return "Computer";
        //   return "Computer:"+super.toString(); <<이런것도 가능하다.
    }
}

