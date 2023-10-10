package com.green.day9.ch5;

public class ArrayEx19 {
    public static void main(String[] args) {
        int[][] score={
                 {101,102,103}
                ,{21,22,23}
                ,{31,32,33}
                ,{41,42,43}
                ,{51,52,53}
        };//     국어수학영어 점수
            //번호 국어 영어 수학 총점 평균
            //-------------------------
            //1  101 a a a ...
            //5...51
            //-------------------------
            //총점??   ??   ??
        System.out.printf("번호 국어 영어 수학 총점 평균\n");
        System.out.println("-----------------------------");

        for (int i = 0; i < score.length; i++) {
            System.out.printf("%d:  ",i+1);
            int sum=0;
            for (int j = 0; j < score[0].length; j++) {
                System.out.printf("%3d  ",score[i][j]);
                sum+=score[i][j];
            }
            System.out.printf("%3d  %4.1f\n",sum,(float)sum/3);

        }
        System.out.println("-----------------------------");
        System.out.printf("총점:");
        for (int i = 0; i < score[0].length; i++) {
            int sum=0;
            for (int j = 0; j < score.length; j++) {
                sum=sum+score[j][i];
            }
            System.out.printf("%3d  ",sum);
        }
    }
}
