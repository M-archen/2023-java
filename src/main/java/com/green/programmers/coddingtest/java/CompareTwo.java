package com.green.programmers.coddingtest.java;
/*
두 수의 연산값 비교하기
문제 설명
연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.

12 ⊕ 3 = 123
3 ⊕ 12 = 312
양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.

단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.

제한사항
1 ≤ a, b < 10,000
입출력 예
a	b	result
2	91	364
91	2	912
입출력 예 설명
입출력 예 #1

a ⊕ b = 291 이고, 2 * a * b = 364 입니다. 둘 중 더 큰 값은 364 이므로 364를 return 합니다.
입출력 예 #2

a ⊕ b = 912 이고, 2 * a * b = 364 입니다. 둘 중 더 큰 값은 912 이므로 912를 return 합니다.
 */
public class CompareTwo {
    class Solution {
        public int solution(int a, int b) {//해결방법생각중....
            int answer = 0;//일단 12 ⊕ 3 = 123 처럼 나오는 값을 생각해보면 12*10 +3 을 생각해 볼 수 있다.
                            //1212 ⊕ 3423 = 12123423 이 되는데  1212*10000 +3423 이 된다.
                            //따라서 a ⊕ b 의 정규식은 a*(3의 최대값의 자릿수+1)+b인 것을 알 수 있다.
            if(b>=1000){
                answer=a*10000+b;
            }else if(b>=100){
                answer=a*1000+b;
            }else if(b>=10){
                answer=a*100+b;
            }else answer=a*10+b;
            //그리고 2*a*b와 값 비교를 하여 더 큰 값을 answer을 리턴하면 끝.

            if(2*a*b>answer)
            {
                answer=2*a*b;
            }
            return answer;
        }
    }
}
