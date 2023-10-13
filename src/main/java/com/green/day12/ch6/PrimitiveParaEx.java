package com.green.day12.ch6;
class Data{
    int x;
}
public class PrimitiveParaEx {
    public static void main(String[] args) {
        Data d=new Data();
        d.x=10;
        System.out.printf("main() : X = %d\n",d.x);
        change(d.x);
        System.out.printf("main() : X = %d\n",d.x);
        Data d2=new Data();
        d2.x=100;
        System.out.printf("main() : d2.X = %d\n",d2.x);//100
        change(d2);
        System.out.printf("main() : d2.X = %d\n",d2.x);//
    }

    public static void change(int x){
        x=1000;
        System.out.printf("change() : X = %d\n",x);
    }
    public static void change(Data d){
        d=new Data();
        d.x=1000;
        System.out.printf("change() : X = %d\n",d.x);
    }
}
