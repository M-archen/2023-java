package com.green.programmers.coddingtest.java;
/*
문자 리스트를 문자열로 변환하기
문제 설명
문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.

제한사항
1 ≤ arr의 길이 ≤ 200
arr의 원소는 전부 알파벳 소문자로 이루어진 길이가 1인 문자열입니다.
입출력 예
arr	            result
["a","b","c"]	"abc"
 */
public class StringListToString {
    class Solution {
        public String solution(String[] arr) {
            String answer = "";
            for (int i = 0; i < arr.length; i++) {
                answer=answer+arr[i];//이게 되네??  문자열의 배열이랑 문자열은 완전 다른 취급이라 안될 줄 알았는데 테스트를 통과했다... 좀더 알아봐야할거같다..
            }
            return answer;
        }
    }
}
