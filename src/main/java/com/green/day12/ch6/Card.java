package com.green.day12.ch6;

public class Card {
    String kind;
    String number;//속성은 객체의 값을 담고있는것.
                  //ex. 사람으로 치면 주민등록번호, 이름,전화번호
 /*   public String getScore(){

        if(number.equals("A")){
            number="1";
        }else if(number.equals("J")){
            number="11";
        }else if(number.equals("Q")){
            number="12";
        }else number="13";


        return number;
    }*/

    public int getScore(){//메소드는 동적인 담당. ex.너 뭐면 뭐 해라!
        switch(number){
            case"A":return 1;
            case"J":return 11;
            case"Q":return 12;
            case"K":return 13;
        }
        return Integer.parseInt(number);
    }
    public void printYourSelf(){
        System.out.printf("%s (%s)\n",kind,number);
    }








}
