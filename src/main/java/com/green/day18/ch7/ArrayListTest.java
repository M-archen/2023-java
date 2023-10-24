package com.green.day18.ch7;
import com.green.day12.ch6.Card;
import com.sun.security.jgss.GSSUtil;

import java.util.*;     //다른패키지에 있는 친구는 사용할려면 임포트를 해야함.
public class ArrayListTest {
    public static void main(String[] args) {
        List list=new ArrayList();// List와 ArrayList는 부모자식관계. List, ArrayList 는 둘다 클래스이름.정확하게는  List는 Interface. 상속관계밖에없다.
        //각 방이 object타입이기때문에 넣을떄는 편한데 꺼내쓸때 겁나불편함.

        list.add(10);       //0번방
        list.add(10.3f);    //1번방
        list.add(10.4d);    //2번방
        list.add(13L);      //3번방
        list.add("dddd");   //4번방
        list.add(new Card());//5번방.

        // int val1=list.get(0);<<오류 why?? object타입으로 나오기 때문

        Object val1=list.get(0);
        int intVal=(int)val1;

        float flaotVal=(float)list.get(1);


        Object obj=10;

        obj=10.3f;
        obj=10.3d;
        obj=103l;
        obj="dddddd";
        obj=new Card();//걍 다들어감 타입 잘 체크해야함. 그래서 잘 안씀....

    }
}
class ArrayListTest2{
    public static void main(String[] args) {
        int v1=10;
        Integer v2=10;//Integer << primitive type 의 객체형이기때문에 메소드를 가지고 있음.
        System.out.println(v1==v2);
        List<Integer> list=new ArrayList();// Integer << 제네렉 이라고 함. <각 방의 타입(Primitive type(X)> 즉 <Wrapper Type> 만 가능함.
        list.add(10);// 처음에 정수가 들어갔으므로 나올때도 정수가 나와야함.  다른타입은 들어갈 수 없음.
        //list.add(10.3f);
        int val1=list.get(0);
        list.add(20);
        list.add(30);
        System.out.println(list.get(1));


        System.out.println("size : "+list.size());

        //[0]:10
        //[1]:20

        for (int i = 1; i <= list.size(); i++) {

            list.add(i*10);
            System.out.printf("[%d] : %d",i,list.get(i));
        }

        System.out.println("-------------");

    }
}
class ArrayListTest3{
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);
        list.add(1,100);//[10,100,20,30,40] 겁 나 편 합 니 다.
        System.out.println(list);
        list.add(3,200);//[10,100,20,200,30,40]
        System.out.println(list);

        list.remove(0);//[100,20,200,30,40]
        System.out.println(list);

    }
}
