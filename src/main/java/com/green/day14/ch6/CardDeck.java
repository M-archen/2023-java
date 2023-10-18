package com.green.day14.ch6;

public class CardDeck {//카드를 담는 통 .통은 1개,카드는 많이 들어감. 카드 1장당 객체.
    Card[] cards;//cards는 전역변수. cards는 Card[]의 주소를 담을 수 있으며 Card[]에 접근,활용가능함.

    public CardDeck() {//기본 생성자를 만들음.
        cards = new Card[52];//전역변수인cards는  Card[52]의 주소를 담을 수 있음.
        String[] patterns = {"Spade", "Heart", "Diamond", "Club"};
        int tmp = 0;
        for (int i = 0; i < patterns.length; i++) {
            //반복문 돌면서 카드생성.
            String pattern = patterns[i];
            for (int z = 1; z <= 13; z++) {
                String denomination = numberReturn(z);//this. 은 주소값. 과 같다. 스태틱이면 불가능.
                cards[tmp++]= new Card(pattern, denomination);// Card(str,str)이므로 Card(str str)<<오버로딩>> 을 만들어줘야함.

            }                   //Card(str str) 생성자 호출 << 스트링값 2개받는 생성자 호출.
        }
    }

    private String numberReturn(int number) {//private이 붙은 애는 같은 클래스에서만 사용가능.
        switch (number) {                        //private을 벗어난 애는 주소값 알고있어도 사용 불가능.
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
        }
        return Integer.toString(number);
    }

    public void printAll() {
        for (int i = 0; i < cards.length; i++) {
            System.out.printf("%s(%s)\n", cards[i].pattern, cards[i].denomination);
        }
    }
    public Card getCard(){
        Card c=null;
        while (true) {
            int ranIdx = (int) (Math.random() * cards.length);
            c = cards[ranIdx];
            if(c!=null) {
                cards[ranIdx] = null;
                break;
            }
        }
        return c;
    }
}