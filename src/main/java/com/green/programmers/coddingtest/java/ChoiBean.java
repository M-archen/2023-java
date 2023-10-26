package com.green.programmers.coddingtest.java;

import java.util.*;

public class ChoiBean {
    class Solution {
        public int solution(int[] array) {
            int Max=0;
            int MaxIdx=0;
            Arrays.sort(array);
            List<Integer> listarr =  new ArrayList<>();
            if(array.length==1){
                return array[0];
            }
            for (int i = 0; i < array.length; i++) {
                listarr.add(array[i]);
            }
            for (int i = 0; i < array.length; i++) {
                if(listarr.contains(i)){
                    if(listarr.lastIndexOf(i)-listarr.indexOf(i)>MaxIdx){
                        MaxIdx=listarr.lastIndexOf(i)-listarr.indexOf(i);
                        Max=listarr.lastIndexOf(i);
                        continue;
                    }else if(listarr.lastIndexOf(i)-listarr.indexOf(i)<MaxIdx){
                        continue;
                    }
                }if(listarr.lastIndexOf(i)-listarr.indexOf(i)==MaxIdx){
                    return -1;
                }
            }
            return Max;
        }
    }
}
