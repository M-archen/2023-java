package com.green.day19.ch7;

public interface PlayingCard {  //interface 에는 멤버필드가 들어있다. public, static, final.
                                //interface에는 추상메소드만 가지고 있는것이다.
                                //일반 클래스에는 그냥 public, static, final중에 아무거나 다 뺄 수 있기 때문에 고정된 멤버필드를 가지고있는
                                //interface보다 유연하다.
    public static final int SPADE=4;//왜적음??
    final int DIAMOND=3;//왜적음??
    static int HEART=2;//왜적음??
    int CLOVER=1;
    public abstract String getCardNUmber();//왜적음??
    String getCardKind();//왜적음??
}

interface PlayingChess extends PlayingCard{ //인터페이스가 인터페이스를 상속받을때는  extends를 쓴다.

}
class Card implements PlayingCard{//클래스가 인터페이스를 상속받을때는 implements를 쓴다.

    @Override
    public String getCardNUmber() {
        return null;
    }

    @Override
    public String getCardKind() {
        return null;
    }
}
class PlayingCardTest{
    public static void main(String[] args) {
        System.out.println(PlayingCard.CLOVER);
    }
}
