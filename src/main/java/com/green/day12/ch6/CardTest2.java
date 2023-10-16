package com.green.day12.ch6;

import com.green.day12.ch6.Card;
import com.green.day4.ch4.Switch;

public class CardTest2 {
    public static void main(String[] args) {
        Card[] cards=makeCards();//메소드 호출.
        System.out.println(cards.length);

        for(Card c:cards){//Card c는 Card 객체에만 접근 가능. 즉 카드 클래스 안에만 접근가능.
            c.printYourSelf();//Spade(A) ,   //Heart(2)
        }
    }
    public static Card[] makeCards() {
        Card[] cards=new Card[52];//객체화,52개의 새로운 배열 만들고 cards[0]에는 Card[0]번방 주소 저장됨.
        String[] kinds={"Spade","Heart","Diamond","Club"};
        int cnt=0;
        for (int i = 0; i < kinds.length; i++) {
            for (int j = 1; j <= 13; j++) {
                int k=0;
                String number=getNumberFromInt(j); //1>>"A" , 2>> "2" ,13>>"K"
                Card c=new Card();
                c.kind=kinds[i];
                c.number=number;
                //cards[(i*13) + (j-1)]=c;
                cards[cnt++]=c;
            }
        }
        return cards;
    }
    public static String getNumberFromInt(int number){
        String answer="";
        switch(number){
            case 1:return "A";
            case 11:return "J";
            case 12:return "Q";
            case 13:return "K";
        }
        return Integer.toString(number);
    }

}
