package com.green.day15.ch7;
class Card{
    static final int KIND_MAX=4;//카드 무늬의 수.
    static final int NUM_MAX=13;//무늬별 카드 수.  // 상수: 한번 입력된 값이 바뀌지 않는 값. 리터럴:값 그자체.//

    static final int SPADE=4;
    static final int DIAMOND=3;
    static final int HEART=2;
    static final int CLOVER=1;
    int kind;
    int number;
    public Card(){
    //    kind=SPADE;
    //    number=1;

        this(SPADE,1);
    }
    public Card(int kind,int n){
        this.kind=kind;
        this.number=n;
    }
    @Override
    public String toString(){

        // return "kind: "+kind+", number: "+number;
        return String.format("kind: %d, number: %d", kind, number);
    }


}
class Deck{
    final int CARD_NUM=52;
    Card[] cardArr=new Card[CARD_NUM];


public Card pick(int n){
    return cardArr[n];
}
    Card pick(){
        int n=(int)(Math.random()*CARD_NUM);
        return cardArr[n];
    }
    public void makeCards(){
        int tmp=0;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <=13 ; j++) {
                cardArr[tmp]=new Card(i,j);
                System.out.println("kind: "+i+", number: "+j);
                tmp++;
            }


        }
    }
}
public class DeckTest {
    public static void main(String[] args) {
        Card c=new Card(4,1);
        System.out.printf("c.kind: %d, c.number: %d\n",c.kind,c.number);//c,kind:4 c.number:1

        Card c2=new Card(Card.SPADE,7);//클래스 이름.A 나오면 무조건 스태틱.
        System.out.printf("c2.kind: %d, c2.number: %d\n",c2.kind,c2.number);//c2.kind:2,c2.number:3
        System.out.println(c+"dd");//kind:4 number:1
        System.out.println(c2.toString()); //kind:4 number:7
        System.out.println(c2);//kind:4 number:7

        Deck deck=new Deck();
        deck.makeCards();
        Card c1=deck.pick(51);
        System.out.println(c1);
        Card c3=deck.pick();
        System.out.println(c3);

    }
}
