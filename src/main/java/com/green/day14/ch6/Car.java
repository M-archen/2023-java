package com.green.day14.ch6;

public class Car {
    String color;
    String gearType;
    int door;


    public Car(){
        this("white");
    }
    public Car(String color){
        this(color,"auto",4);
    }
    public Car(String color,String gearType,int door){
        this.color=color;
        this.gearType=gearType;
        this.door=door;
    }
 /*   String color;
    String gearType;//변속기 종류-auto(자동),manual(수동)
    int door;//문의 개수
    Car(String blue){
        color=blue;
        gearType="auto";
        door=4;
    }
    Car(){
        color="white";
        gearType="auto";
        door=4;
    }*/
    public void printMyself(){
        System.out.printf("Color=%s, Geartype=%s, Door=%s\n",color,gearType,door);
    }



}
class CarTest{
    public static void main(String[] args) {
        Car car1=new Car();
        Car car2=new Car("blue");

        car1.printMyself(); //color=white ,geartype=auto, door=4
        car2.printMyself(); //color=blue  ,gearType=auto, door=4
    }
}
