package com.green.day16.ch7;


import com.green.day15.ch7.*; //<<와일드카드

import static com.green.day13.ch6.MyMath2.*;

//method 앞에 static을 붙이는걸 권장.
// 즉  static이 붙지않은 멤버필드를 사용하지 않는다면 붙일 수 있다.



public class PackageTest {
    public static void main(String[] args) {
        Parent parent;
        //staticNum(10);
            //private한 멤버필드에 값을 넣는방법.
            //1. 생성자 이용.
            //2.public한 method를 이용하여 private한 멤버필드에 값을 넣는다.


            //private한 멤버필드의 값을 빼내는 방법.
            //method를 이용한다.(getter)
    }
}
