package com.green.day15.ch7;
class Card extends Object{
    static final int KIND_MAX=4;//카드 무늬의 수.
    static final int NUM_MAX=13;//무늬별 카드 수.  // 상수: 한번 입력된 값이 바뀌지 않는 값. 리터럴:값 그자체.//
    static final int SPADE=4;
    static final int DIAMOND=3;
    static final int HEART=2;
    static final int CLOVER=1;
    int kind;
    int number;
    public Card(){// 생성자와 메소드와의 차이점. 생성자: 리턴타입이 없다,클래스와 이름이 같다,말 그대로 생성할때만 호출 할 수 있다.
        //    kind=SPADE;
        //    number=1;

        this(SPADE,1);
    }
    public Card(int kind,int n){
        this.kind=kind;
        this.number=n;
    }
    @Override //애노테이션.(오버라이딩이 맞다.) {검증하기 위하여 적는것.}
    public String toString(){//toString()은 부모것이 아니라 Object것을 갖고 온다.

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
    public void shuffle(){
        for (int i = 0; i < CARD_NUM; i++) {
            int rIdx=(int)(Math.random()*CARD_NUM);
            Card tmp= cardArr[i];
            cardArr[i]=cardArr[rIdx];
            cardArr[rIdx]=tmp;
        }
        for (int i = 0; i < cardArr.length; i++) {
            System.out.println(cardArr[i]);
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
        System.out.println(c2);//kind:4 number:7                //|           | class | package | 상속 | 전부 |
                                                                //| private   |   O   |    X    |   X  |  X  |  ('상수'를 제외한 거의 대부분의 멤버필드는 private으로 막아놓는다.
        Deck deck=new Deck();                                   //| default   |   O   |    O    |   X  |  X  |
        deck.makeCards();                                       //| protected |   O   |    O    |   O  |  X  |
        Card c1=deck.pick(51);                               //| public    |   O   |    O    |   O  |  O  |
        System.out.println(c1);
        Card c3=deck.pick();
        deck.shuffle();
        System.out.println();
    }
}
