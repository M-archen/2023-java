package com.green.day10.ch6;

public class ReturnNumberBox {

    int sum(int n1, int n2){//메소드가 void가 아닌 메소드는 return메소드.
        return n1+n2;
    }
    int abs(int n3){
        if(n3>=0)
            return n3;
        else return -n3;
    }
}
