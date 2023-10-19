package com.green.day13.ch6;

class Card{
    String pattern; //Spade , Heart
    String denomination; //A, 2~10, J, Q, K

   void printYourSelf(){
        System.out.printf("%s-%s\n",pattern,denomination);
    }


}
public class CardTest3 {
    public static void main(String[] args) {

        // Card[] cards=new Card[52];//카드 배열을 쓰고싶다.cards(Card배열 타입) =! c2(Card타입)
        // 배열의 각방의 타입은 카드 타입. ex) String[] >> 각 방은 String타입.
        Card[] cards = CardTest3.makeCards();
        System.out.println(cards.length);

        /*for (Card c : cards) {//Card c는 Card 객체에만 접근 가능. 즉 카드 클래스 안에만 접근가능.
            c.printYourSelf();//Spade(A) ,   //Heart(2)
        }

         */
        //향상된 for문>> for(자료형 한 단계 아래의 자료형의 변수명: 배열명){

        for (int i = 0; i < cards.length; i++) {
            cards[i].printYourSelf();
        }
    }


    public static Card[] makeCards(){
        Card[] cArr = new Card[52];
        String[] kinds={"Spade","Heart","Diamond","Club"};
        int cnt=0;
        for (int i = 0; i < kinds.length; i++) {
            for (int j = 1; j <= 13; j++) {
                String number=numberReturn(j); //1>>"A" , 2>> "2" ,13>>"K"
                Card c=new Card();
                c.pattern=kinds[i];
                c.denomination=number;
                //cards[(i*13) + (j-1)]=c;
                cArr[cnt++]=c;
            }
        }
        return cArr;




       /* for (int i = 0; i < cArr.length; i++) {
            String pattern=kinds[(i)/13];
            String denomination=numberReturn((i)%13);
          //  cArr[i]=new Card(); //카드의 주소값이 담겼다. i마다 주소값이 달라짐.
          //  cArr[i].pattern=pattern;
          //  cArr[i].denomination=denomination;   카드배열의 각방의 타입은 카드타입
           Card c=new Card();                           ||
           c.pattern=pattern;            카드배열의 각방의 타입은 카드타입.
           c.denomination=denomination;
           cArr[i]=c; //위의 주석과 같다.
        }
        return cArr;

        */
    }
    public static String numberReturn(int number){
        switch(number){
            case 1:return "A";
            case 11:return "J";
            case 12:return "Q";
            case 13:return "K";
        }
        return Integer.toString(number);
    }
}
