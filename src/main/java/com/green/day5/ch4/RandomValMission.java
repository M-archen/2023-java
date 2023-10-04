package com.green.day5.ch4;

public class RandomValMission {
    public static void main(String[] args) {
        final int MIN=15,MAX=20;

        //MIN MAX 상수만 사용하여
        //MIN ~ MAX나올 수 있는 랜덤 숫자를 만드는 로직을 구연하세요.


        for(int i=0;i<1000;i++)
        {
            int Val=(int)(Math.random()*(MAX-MIN+1))+MIN;
            System.out.println("Val : "+Val);
            if(Val<MIN||Val>MAX)
            {
                System.out.println("범위를 벗어났습니다.");

            }

        }// 만약  System이나  String[] 이 빨간색으로 뜨면 jdk이 제대로 설치 되지 않아서 뜨는것.
        //우상단 설정.>> project structure >> SDK 버젼 설정. (폴더까지 같아야함.)
    }
}
