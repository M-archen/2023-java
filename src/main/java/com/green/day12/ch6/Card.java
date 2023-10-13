package com.green.day12.ch6;

public class Card {
    String kind;
    String number;
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

    int getScore(){
        switch(number){
            case"A":return 1;
            case"J":return 11;
            case"Q":return 12;
            case"K":return 13;
        }
        return Integer.parseInt(number);
    }




}
