package com.green.programmers.coddingtest.java;

import java.util.Arrays;

/*
배열 만들기 2
문제 설명
정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.

만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.

제한사항
1 ≤ l ≤ r ≤ 1,000,000
입출력 예
l	r	result
5	555	[5, 50, 55, 500, 505, 550, 555]
10	20	[-1]
입출력 예 설명
입출력 예 #1

5 이상 555 이하의 0과 5로만 이루어진 정수는 작은 수부터 5, 50, 55, 500, 505, 550, 555가 있습니다. 따라서 [5, 50, 55, 500, 505, 550, 555]를 return 합니다.
입출력 예 #2

10 이상 20 이하이면서 0과 5로만 이루어진 정수는 없습니다. 따라서 [-1]을 return 합니다.
 */
public class MakeArray2 {
    class Solution {
        public int[] solution(int l, int r) {
            int[] answer = {};
            //50이상일때...
            //5,  50,55,   500,505,550,555,   5000,5005,5050,5055,5500,5505,5550,5555
            //5*1  5*10    5*10*10            5*10*10*10
            //
            int count =0;
            for (int i = l; i <= r; i++) {
               // 5*(10*count)
            }
            return answer;
        }
    }
}