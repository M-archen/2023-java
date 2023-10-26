package com.green.programmers.coddingtest.java;

import java.util.Arrays;

/*
뒤에서 5등까지
문제 설명
정수로 이루어진 리스트 num_list가 주어집니다. num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

제한사항
6 ≤ num_list의 길이 ≤ 30
1 ≤ num_list의 원소 ≤ 100
입출력 예
num_list	result
[12, 4, 15, 46, 38, 1, 14]	[1, 4, 12, 14, 15]
입출력 예 설명
입출력 예 #1

[12, 4, 15, 46, 38, 1, 14]를 정렬하면 [1, 4, 12, 14, 15, 38, 46]이 되고, 앞에서 부터 5개를 고르면 [1, 4, 12, 14, 15]가 됩니다.
 */
public class BackFifth {
    class Solution {
        public int[] solution(int[] art) {
            for (int i = art.length-1; i >0 ; i--){
                for (int j = 0; j < i; j++) {
                    int nIdx=j+1;
                    if(art[j]>art[nIdx]){
                        int tmp=art[j];
                        art[j]=art[nIdx];
                        art[nIdx]=tmp;
                    }
                }
            }
        int[] arr=new int[5];
            for (int i = 0; i < arr.length; i++) {
                arr[i]=art[i];
            }
            return arr;
        }
    }
}
