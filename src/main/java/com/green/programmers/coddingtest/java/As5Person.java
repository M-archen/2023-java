package com.green.programmers.coddingtest.java;

public class As5Person {
    class Solution {
        public String[] solution(String[] names) {
            String[] answer=new String[(names.length/5)+1];
            int j=0;
            for (int i = 0; i < answer.length; i++) {
                answer[i]=names[j];
                j=j+5;
            }
            return answer;
        }
    }
}
