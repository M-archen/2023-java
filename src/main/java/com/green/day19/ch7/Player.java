package com.green.day19.ch7;
class PlayerTest{
    public static void main(String[] args) {
        AudioPlayer ap=new AudioPlayer();
        ap.play(10);
        VideoPlayer vp=new VideoPlayer();
        vp.play(20);
        Player player=ap;
        player.play(30);
        player= vp;
        player.play(40);
    }
}
public abstract class Player {//클래스는 자식 메소드중에 추상 메소드가 하나라도 있으면 자신도 추상 클래스가 되어야 한다. 추상 클래스는 객체화가 안된다.
                                //부모로써는 활동 가능.
                                //abstract method의 특징. 강제성이 있다.
                                //주로 설계자분들이 많이 사용한다.
                                //객체마다 내용이 완전 다를때 추상 메소드로 만든다.
    public abstract void play(int pos);  //추상메소드. 구현부가 없다.선언부만 있다. play method 있을 수도??
}

class AudioPlayer extends Player{ //추상 메소드는 강제성이 있다. 오버라이딩 하라는 강제성이 있다.

    @Override
    public void play(int pos) {
        System.out.println("Audio Play 위치 : "+ pos);
    }
}
class VideoPlayer extends Player{
    @Override
    public void play(int pos) {
        System.out.println("Video Play 위치 : "+ pos);
    }
}
