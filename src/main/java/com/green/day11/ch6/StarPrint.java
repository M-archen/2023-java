package com.green.day11.ch6;

public class StarPrint {

    void Line(int n) {

        for (int i = 0; i < n; i++) {
            System.out.printf("*");
        }
        System.out.println();
    }

    void square(int i) {
        for (int j = 0; j < i; j++) {
            Line(i);//메소드 안에서 다른 메소드 호출 가능.
        }
    }

    void triangle(int i) {
        for (int j = 1; j <= i; j++) {
            Line(j);
        }
    }
    String chkGenderById(String ID) {
        char ch=ID.charAt(7);
        switch(ch){
            case'2','4':return "여성";
            case'1','3':return "남성";
        }
        return "유효하지 않은 주민번호.";
    }

    int sumFromTo(int n,int m){
        int sum=0;
        for (int i = n; i <= m; i++) {
            sum+=i;
        }
        return sum;
    }


}
