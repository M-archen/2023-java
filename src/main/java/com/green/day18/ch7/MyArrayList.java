package com.green.day18.ch7;

import com.green.programmers.coddingtest.java.StringListToString;

public class MyArrayList {
    private int[] arr;
    public MyArrayList(){
        arr=new int[0];
    }
    int i=0;
    public void add(int num){
        int[] tmp=new int[arr.length+1];
        for (int j = 0; j < arr.length; j++) {
            tmp[j]=arr[j];
        }
        tmp[arr.length]=num;
        arr=tmp;

        System.out.println(i+":"+num);
        i++;
    }
    public void add(int idx,int num){

        int[] tmp=new int[arr.length+1];
        for (int j = 0; j < idx; j++) {
            tmp[j]=arr[j];
        }
        tmp[idx]=num;
        tmp[idx+1]=arr[idx];
        for (int j = idx; j <arr.length ; j++) {
            tmp[j+1]=arr[j];
        }
        arr=tmp;
    }
    public String toString(){//치명적인 단점. 값을 한번도 안넣고 호출하면 에러터짐.
        if(arr.length==0){
            return "[]";
        }
        String lang=String.format("[%d",arr[0]);
        for (int j = 1; j < arr.length; j++) {
                lang+=String.format(", %d",arr[j]);
        }
        lang+="]";
        return lang;
    }

}

class MyArrayListTest{
    public static void main(String[] args) {
        MyArrayList list=new MyArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);//[10,20,30]
        list.add(1,40);
        System.out.println(list);//[10,40,20,30]
    }
}