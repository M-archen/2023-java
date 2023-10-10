package com.green.programmers.coddingtest.java;

/*
프로그래머스 코딩 기초 트레이닝-문자열 겹쳐쓰기
문제 설명
문자열 my_string, overwrite_string과 정수 s가 주어집니다. 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.

제한사항
my_string와 overwrite_string은 숫자와 알파벳으로 이루어져 있습니다.
1 ≤ overwrite_string의 길이 ≤ my_string의 길이 ≤ 1,000
0 ≤ s ≤ my_string의 길이 - overwrite_string의 길이
입출력 예
my_string	overwrite_string	s	result
"He11oWor1d"	"lloWorl"	2	"HelloWorld"
"Program29b8UYP"	"merS123"	7	"ProgrammerS123"
입출력 예 설명
입출력 예 #1

예제 1번의 my_string에서 인덱스 2부터 overwrite_string의 길이만큼에 해당하는 부분은 "11oWor1"이고 이를 "lloWorl"로 바꾼 "HelloWorld"를 return 합니다.
입출력 예 #2

예제 2번의 my_string에서 인덱스 7부터 overwrite_string의 길이만큼에 해당하는 부분은 "29b8UYP"이고 이를 "merS123"로 바꾼 "ProgrammerS123"를 return 합니다
 */

public class StringGyeopcheo {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer=my_string.substring(0,s)+overwrite_string;//섭스트링 메소드 = str.substring(숫,자) >> 배열처럼
                                                                    //인식하여  문자열(숫자~ 숫자) 까지 받아온다.
        //해결방법: my_string에서 0~s까지 문자열을 받아온 다음 s이후 부터는 일단 overwrite_string으로 채워준다
        // 그 이후 조건을 보면my_string의 길이- overwrite_string의 길이>=s>=0 이므로 overwrite_string이 항상 my_string보다 작거나 같다.
        //따라서 overwrite_string을 채워준 부분 이후에 my_string의 남은 부분을 이어주면 된다.
        if(my_string.length()>answer.length()) //만약 my_string의 길이가 answer_string(my_string의 앞부분과 overwrite_string) 보다 크다면)
        {
            answer=answer+my_string.substring(answer.length(),my_string.length());//정답에다 my_stirng나머지 끝자락을 추가하면 끝!.
        }
        return answer;
    }
}
