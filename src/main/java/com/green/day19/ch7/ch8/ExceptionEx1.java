package com.green.day19.ch7.ch8;

public class ExceptionEx1 {// try 로 감싼부분은 예외가 발생되면 catch가 잡아서 하고싶은일을 적는다.
    public static void main(String[] args) {
        int num=0;
        //num=num/0; 만약에 여기서 << 실행되면 죽어버림.
        try{//예외가 발생하면
            num=10;
            num=num/0;

        }catch(Exception e){//여기서 잡는다.
            e.printStackTrace(); //무슨에러인지 알고싶어.
            System.out.println("예외발생!!");
            num=-1;
        }finally{//예외가 발생되는 안되든 무조건 실행된다.
            System.out.println("finally 실행");
        }
        System.out.printf("num : %d\n",num);
        System.out.println("---끝---");
    }
}
class ExceptionEx1_2{
    public static void main(String[] args) {
        div(20);
    }
    public static void div(int num){
        //num=num/0; 만약에 여기서 << 실행되면 죽어버림.
        try{//예외가 발생하면
            num=10;
            return; //리턴문을 만나면 보통은 그냥 돌아가지만..
                    //try catch finally 문은 return 문을 만나면 finally문은 실행하고 돌아감.

        }catch(Exception e){//여기서 잡는다.
            e.printStackTrace(); //무슨에러인지 알고싶어.
            System.out.println("예외발생!!");
            num=-1;
        }finally{//예외가 발생되는 안되든 무조건 실행된다.
            System.out.println("finally 실행");
        }
        System.out.printf("num : %d\n",num);
        System.out.println("---끝---");
    }
}
class ExceptionEx1_3{
    public void sum(){}
    public static void main(String[] args) {
        try{
            //int num=10/0;
            //ExceptionEx1_3 obj=null;
            //obj.sum(); << 널포인트 익셉션.
            int[] arr=new int[10];
            arr[10]=10;
        }catch(ArithmeticException e){
            System.out.println("수학적 예외");
        }catch(NullPointerException e){
            System.out.println("널포인트 예외");
        }catch(Exception e){// catch중에 하나만 실행됨.
            System.out.println("모든 예외");
        }   //예외 종류에 따라 다른 처리를 하고싶을때 씀.. 커스텀하기위해서 일부러 예외를 발생시켜 ..like) if else 문.
        System.out.println("끝!!!");
    }
}
