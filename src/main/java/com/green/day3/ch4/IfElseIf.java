package com.green.day3.ch4;

public class IfElseIf {
    public static void main(String[] args){
        if(1==2){//if()안에 올 수 있는 타입은 boolean타입 밖에 없음.
            //그룹으로 묶어놓으면, 결국 실행되는건 한개밖에 없음. 반면  if else가 아닌 if문으로만 빼버리면 1,2,3이 다 실행됨.
            System.out.println("1");
        }else if(2==3){
            System.out.println("2");
        }else if(3==4){
            System.out.println("3");
        }else{
            System.out.println("else");
        }

    }
}
