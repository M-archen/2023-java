package com.green.day11.ch6;

public class DiffPriRef {//Promotive타입과 Reference타입의 차이점.

    public static void main(String[] args) {//static << 메모리 이미 올라가있음.
        int num=30;
        changeVal(num);//changeVal함수 호출하고 num값을 넘겨준다.근데 복사해서 준다. 원본을 주진 않는다.
        System.out.println("num : "+num);//즉 changeVal

        NumBox nb=new NumBox();//객체화를 했다. nb에 저장된 값은 NumBox란 저장공간에 접근할 수 있는 주소값.
        System.out.println("(0)nb에 저장된 값 :"+nb);
        System.out.println("(1)nb.num : "+nb.num);//nb.num을 찍으면 int num의 초기값이 0이기 때문에 0이 출력된다.
        nb.num=30;//속성에다 30을 집어넣음
        System.out.println("(2)nb.num : "+nb.num);
        System.out.println("(2.5)nb에 저장된 값 :"+nb);
        changeVal(nb);//메소드 호출(nb에 들어있는 값을 복사하여 nb2에 줌)
        System.out.println("(3)nb.num : "+ nb.num);

    }

    public static void changeVal(int val){
        System.out.println("changeVal - int");
        val=10;
    }                                               //이름이 똑같은 메소드를 생성할 수 있다. (오버로딩)
    public static void changeVal(NumBox nb2){//nb2는 NumBox 의 매개변수.

        nb2=new NumBox();//nb2라고 이름만 똑같은데 주소값이 다른애 생성.
        System.out.println("(2.6)nb2 : "+nb2);//NumBox의 매개변수로 받았기 때문에 nb와 값이 같다(둘다 주소값).
        nb2.num=10;

        System.out.println("(2.8)nb2 : "+nb2);
        System.out.println("changeVal - NumBox");
    }
}
class NumBox{
    int num;//속성밖에 없다.
}