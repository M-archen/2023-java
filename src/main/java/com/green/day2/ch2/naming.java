package com.green.day2.ch2;

import java.util.Date;

public class naming {
    public static void main(String[] args){
        //1. 대소문자 구별. 길이제한x
        int abc,abcde,Abc,ABc,IWILLBEBACK;

        //2.이름으로 예약어 사용X;
        // int int (X) , int void (X) , int static (X)

        //3.숫자 시작 안됨.
        //int 1ab (X)
        int a1b,ab1;

        //4.특수문자는 (언더바)_ , $ 만 가능.
        int _ab,$ab;

        //---------------------------------------------------

        //케이스 기법
        //hello my name is baik

        //1. 파스칼 케이스 기법 (클래스명) -> 대문자로 시작                   |
        //HelloMyNameIsBaik   (변수 이름은 띄어쓰기X, _(언더바)로 엮어야함.)  |
        //                                                              | 자바에서 주로 많이 씀.
        //2.카멜 케이스 기법 (변수명, 메소드명) -> 소문자로 시작               |
        //helloMyNameIsBaik                                            |

        //3.케밥 케이스 기법
        //hello-my-name-is-baik

        //4.스네이크 케이스 기법
        //hello_my_name_is_baik

        //----------------------------------------------------
        //상수는 전부 대문자, 구분은 _(언더바)

        //PI, MAX_NUMBER
        final int PI=0, MAX_NUMBER=10;

        Date today=new Date(); //Date객체를 생성해서, 그 주소를 today에 저장. (객체지향에서의 핵심)

    }
}

