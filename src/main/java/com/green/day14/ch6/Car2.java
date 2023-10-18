package com.green.day14.ch6;

public class Car2 {
    String color;
    String gearType;
    int door;
    public void printMyself(){
        System.out.printf("Color=%s, Geartype=%s, Door=%s\n",color,gearType,door);
    }


    Car2(){

    }
    public Car2(String color,String gearType,int door){
        this.color=color;
        this.gearType=gearType;
        this.door=door;
    }
    public Car2(Car2 car2){
        color=car2.color;
        gearType=car2.gearType;
        door= car2.door;
    }
}
class Car2Test{
    public static void main(String[] args) {
        Car2 c1= new Car2();
        c1.color="black";
        c1.gearType="manual";
        c1.door=5;

        Car2 c2=new Car2(c1);// Car2 생성자한테 c1 즉 Car2의 주소값을 보낼 수 있다. c1과 c2는 다른 존재긴 하나. c1이 갖고있는값을 복사하여 c2로 복사.

        c1.printMyself();//color=black, geartype=manual, door=5
        c2.printMyself();//color=black, geartype=manual, door=5
    }
}
