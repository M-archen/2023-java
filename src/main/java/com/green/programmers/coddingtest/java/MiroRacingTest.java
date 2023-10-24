package com.green.programmers.coddingtest.java;
import java.util.*;
public class MiroRacingTest {
    class Solution {
        public long solution(int n, int m, int[][] tests) {
            //n=가로길이, m=세로길이, [x,y,d,flag] 출발점 좌표(x,y) 최대이동거리d, flag==1 도착,
            long answer = 0;
            // 최대이동거리 d는  tests[i][3] 이며 좌표평면상으로
            //마름모 모양이다.
            //1.가장 먼 좌표 or n*m 의 배열을 생성함
            //2.2중for문을 이용하여
            // (x,y)에서 시작하여 세로,가로 길이가 d인 마름모를 생각.
            //3. if(flag 가 1이면) 일단  answer에 ++
            //4. 아니면 영원히 그 좌표는 없는샘.
            //5.
            int testcaseLength= tests.length;//출발점 갯수.
            int[][] nm=new int[n*m][2]; //[0,0][0,1][0,2][0,3][0,4][0,5][0,6][0,7][1,0][1,1]...
            int num=0;
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= m; j++) {
                    nm[num][0]=i;
                    nm[num][1]=j;
                    num++;
                }
            }//1단계.
            int d=0;
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= m; j++) {

                }
            }



            return answer;
        }
    }
}
