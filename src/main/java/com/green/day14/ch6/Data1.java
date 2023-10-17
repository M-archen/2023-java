package com.green.day14.ch6;

public class Data1 {
    int value;
    int value1;
    int value2;

    public Data1(){//기본 생성자.(default Constructor) .생성자가 하나도 없을때 기본 생성자를 만들어준다.
        //메서드의 하나의 일환. 객체 생성할때만 생성 할 수 있어서 특별함. 파라미터없음. 리턴타입 없음.
       this(100,200,300);
    }//생성자도 오버로딩 가능. (파라미터 O)
    //생성자가 필요한 이유 1.>> 객체생성할 때 생성자가 필요.

    public Data1(int a){
        //2. 나중에  멤버필드는 private를 붙이기때문에 .을 통해서 접근이 불가하다.
        //따라서 생성자를 통해서 접근이 가능하다.
        //생성과 동시에 멤버필드값을 세팅하고 싶을때 사용.
        value =a;
    }
    public Data1(int a,int b){

    }
    public Data1(int a,int b,int c){
        value=a;
        value1=b;
        value2=c;
    }
    public void printMyself(){
        System.out.printf("value:%d,value2:%d,value3:%d\n",value,value1,value2);
    }

}

class ConstructorTest {
    public static void main(String[] args) {
        Data1 dt=new Data1(); //객체생성이긴한데 정확하긴한데 생성자호출.
        dt.printMyself();

        Data1 data1_2 = new Data1(10,20,30);
        data1_2.printMyself();


    }
}