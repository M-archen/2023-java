package com.green.day7.ch5;

public class Array {
    public static void main(String[] args) {
        int n1=10,n2=20,n3=30;
        int[] arr={10,20,30};
        String[] arr2={"A","B","C","D","응애"};

        int[] arr3= new int[3]; //각방에는 0이 들어가 있음.
        int arr4[]= new int[3];//이렇게 하면 안된다는건 아닌데.... 그냥 위에꺼 쓰자.

        System.out.println("arr[0]: "+arr[0]);
        System.out.println("arr[1]: "+arr[1]);
        System.out.println("arr[2]: "+arr[2]);


        //Index ^ out of bounds...어쩌구 => 없는 배열 번호 써서 오류뜬거임.

        arr[0]=200; //대입 가능.(원래는 10이 있었으나 200으로 변경.)
        //변수가 단독주택 느낌이라면 배열은 아파트느낌

        System.out.println("arr.length : "+arr.length);
        System.out.println("arr2.length : "+arr2.length);
    }
}
