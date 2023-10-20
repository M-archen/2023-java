package com.green.programmers.coddingtest.java;

public class PressKeypad {
    class Solution {
        public String solution(int[] numbers, String hand) {
            String answer = "";
            int moveL=333;
            int moveR=333;
            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i]==1||numbers[i]==4||numbers[i]==7){
                    answer+="L";
                    moveL=numbers[i];
                }else if(numbers[i]==3||numbers[i]==6||numbers[i]==9){
                    answer+="R";
                    moveR=numbers[i];
                }//1,3,4,6,7,9 했고. 2,5,8,0 남음.
                else if(hand.equals("right")){//오른손잡이일때.
                    if(numbers[i]==2){   //위부터 차례대로 i=2 일때
                        if(moveR==3||moveR==5){  //1칸
                            answer+="R";
                            moveR=numbers[i];
                        }else if(moveR==6||moveR==8){//2칸
                            if(moveL==4||moveL==7||moveL==0||moveL==8){
                                answer+="R";
                                moveR=numbers[i];
                            }
                        }else if(moveR==9||moveR==0){//세칸
                            if(moveL==7||moveL==0){
                                answer+="R";
                                moveR=numbers[i];
                            }
                        }else{
                            answer+="L";
                            moveL=numbers[i];
                        }
                    }else if(numbers[i]==5){ //i=5일때
                        if(moveR==2||moveR==6||moveR==8){//1칸
                            answer+="R";
                            moveR=numbers[i];
                        }else if(moveR==3||moveR==9||moveR==0){//2칸
                            if(moveL==1||moveL==7||moveL==0){
                                answer+="R";
                                moveR=numbers[i];
                            }
                        }else{
                            answer+="L";
                            moveL=numbers[i];
                        }
                    }else if(numbers[i]==8){//i=8일때
                        if(moveR==5||moveR==9||moveR==0){//1칸
                            answer+="R";
                            moveR=numbers[i];
                        }else if(moveR==6||moveR==2){//2칸
                            if(moveL==4||moveL==2||moveL==1){
                                answer+="R";
                                moveR=numbers[i];
                            }
                        }else if(moveR==3&&moveL==1){//3칸
                            answer+="R";
                            moveR=numbers[i];
                        }else{
                            answer+="L";
                            moveL=numbers[i];
                        }
                    }if(numbers[i]==0){//i=0일때
                        if(moveR==8){//1칸
                            answer+="R";
                            moveR=numbers[i];
                        }else if(moveR==5||moveR==9){//2칸
                            if(moveL==7||moveL==4||moveL==5||moveL==1||moveL==2){
                                answer+="R";
                                moveR=numbers[i];
                            }
                        }else if(moveR==2||moveR==6){//3칸
                            if(moveL==2||moveL==4||moveL==1){
                                answer+="R";
                                moveR=numbers[i];
                            }
                        }else if(moveR==3&&moveL==1){//4칸
                            answer+="R";
                            moveR=numbers[i];
                        }else{
                            answer+="L";
                            moveL=numbers[i];
                        }
                    }
                }else{
                    answer+="R";
                    moveR=numbers[i];
                }if(hand.equals("left")){//왼손잡이일때.
                    if(numbers[i]==2){   //위부터 차례대로 i=2 일때
                        if(moveL==1||moveL==5){  //1칸
                            answer+="L";
                            moveL=numbers[i];
                        }else if(moveL==4||moveL==8){//2칸
                            if(moveR==6||moveR==8||moveR==0||moveR==9){
                                answer+="L";
                                moveL=numbers[i];
                            }
                        }else if(moveL==7||moveL==0){//세칸
                            if(moveR==9||moveR==0){
                                answer+="L";
                                moveL=numbers[i];
                            }
                        }else{
                            answer+="R";
                            moveR=numbers[i];
                        }
                    }else if(numbers[i]==5){ //i=5일때
                        if(moveL==2||moveL==4||moveL==8){//1칸
                            answer+="L";
                            moveL=numbers[i];
                        }else if(moveL==1||moveL==7||moveL==0){//2칸
                            if(moveR==3||moveR==9||moveR==0){
                                answer+="L";
                                moveL=numbers[i];
                            }
                        }else{
                            answer+="R";
                            moveR=numbers[i];
                        }
                    }else if(numbers[i]==8){//i=8일때
                        if(moveL==5||moveL==7||moveL==0){//1칸
                            answer+="L";
                            moveL=numbers[i];
                        }else if(moveL==4||moveL==2){//2칸
                            if(moveR==3||moveR==2||moveR==6){
                                answer+="L";
                                moveL=numbers[i];
                            }
                        }else if(moveL==1&&moveR==3){//3칸
                            answer+="L";
                            moveL=numbers[i];
                        }else{
                            answer+="R";
                            moveR=numbers[i];
                        }
                    }else if(numbers[i]==0){//i=0일때
                        if(moveL==8){//1칸
                            answer+="L";
                            moveL=numbers[i];
                        }else if(moveL==5||moveL==7){//2칸
                            if(moveR==2||moveR==3||moveR==5||moveR==6||moveR==9){
                                answer+="L";
                                moveL=numbers[i];
                            }
                        }else if(moveL==2||moveL==4){//3칸
                            if(moveR==2||moveR==3||moveR==6){
                                answer+="L";
                                moveL=numbers[i];
                            }
                        }else if(moveL==1&&moveR==3){//4칸
                            answer+="L";
                            moveL=numbers[i];
                        }else{
                            answer+="R";
                            moveR=numbers[i];
                        }
                    }else{
                        answer+="R";
                        moveR=numbers[i];
                    }
                }
            }
            return answer;
        }
    }
}
