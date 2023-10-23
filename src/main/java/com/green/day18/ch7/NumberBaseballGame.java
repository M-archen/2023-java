package com.green.day18.ch7;

import java.util.Scanner;

public class NumberBaseballGame {//중복안되는 0~9  주어짐

    public static void main(String[] args) {
        NumberBaseball nbb=new NumberBaseball(3);
        nbb.start();


    }
}
class NumberBaseball{
    private final int GAME_COUNT;
    private final int[] gameNumbers;// 레퍼런스변수의 파이널은 주소값 변경은 안된다.
    public NumberBaseball(int count) {
        GAME_COUNT=count;//생성자를 통해서 넣는 상수도 가능함.
        gameNumbers=new int[count];
    }

    public void start(){
        setRandomNumNotDuplicate(); //0~9사이의 랜덤값 중복없이.
        getUserInput();
    }

    private void getUserInput(){
        Scanner scan=new Scanner(System.in);
        final int[] userArr=new int[GAME_COUNT];
        for (int i = 0; i < GAME_COUNT; i++) {
            System.out.printf("%d 숫자 >> ",i+1);
            userArr[i]= scan.nextInt();
        }
        boolean r=isContinuecheckResult(userArr);
        scan.close();
    }
     //0   1...
    // 1    2   3   4   5   6   7   8   9   0       gameNumbers[i]
    // 1    3   4   5   6   7   4   9   6   2       userArr[i]
    //1 st   1ball  1 out


    private boolean isContinuecheckResult(int[] userArr) {
        int strike=0, ball=0, out=0;
        for (int i = 0; i < gameNumbers.length; i++) {

            for (int j = 0; j < userArr.length; j++) {
                if (userArr[i] == gameNumbers[i]) {
                    strike++;
                } else ball++;
            }
        }
        out = GAME_COUNT - strike - ball;
        return true;
    }

    void setRandomNumNotDuplicate(){
        for(int i = 0; i < gameNumbers.length ; i++){
            gameNumbers[i] = (int)(Math.random() * 10);
            for(int j = 0; j < i; j ++){
                if(gameNumbers[i] == gameNumbers[j]){
                    i--; 
                    break; 
                }
            }
        }

    }

}
