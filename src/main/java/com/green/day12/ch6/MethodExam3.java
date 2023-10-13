package com.green.day12.ch6;

public class MethodExam3 {


    int sumText(String str){
        char[] charArr=str.toCharArray();//리턴타입.char[]
        int sum=0;
        for(char ch : charArr){
            sum+=Character.getNumericValue(ch);//charArr의 배열의 문자의 숫자를 int로 바꿔준다.
        }
        return sum;
    }







    public static void main(String[] args) {
        MethodExam3 me3=new MethodExam3();//MethodExam3 me3 >> MethodExam3라는 객체의 주소값을 담을 수 있는 레퍼런스 변수.
        int sum=me3.sumText("sasasdas");
        System.out.println("sum : "+ sum);; //12

        System.out.println("sum2 :" +me3.sumText("222"));//6

    }

}
