package com.green.day20.ch8;

public class ExceptionEx9 {
    public static void main(String[] args) {
        try{
            Exception e=new Exception("d일부러 에러 터뜨림");
            System.out.println("dddddd");
            throw e;
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("--끝--");
    }
}
