package com.green.day11.ch6;

public class MethodExam2 {//패키지가 다르면 똑같은 이름을 쓸 수 있다. 그렇지만 그냥 헷갈리니까 다른이름쓰자.

    String scoreResultOpt(int i) {
        String str = new String("");
        /*if(i==100)return str="A+";
        if(i>100) {
            str = "점수를 확인해주세요.";
        }else if(i<100&&i>=90){
            str="A";
        }else if(i>=80){
            str="B";
        }else if(i>=70) {
            str="C";
        }                                           //너무 힘들게 씀...
        else if(i/10<=10&&i%10>=8){
            str=str+"+학점";
        }else if(i/10<10&&i%10>=4){
            str=str+"0학점";
        }else if(i/10<10&&i%10<=3){
            str=str+"-학점";
        }
        else if(i>=0&&i<70)
        {
            str="D 학점";
        }
        else str="점수를 확인해주세요.";

        return str;
    }*/
        if ((100 < i) || (i < 0)) return str = "점수를 확인해주세요.";
        else if (i < 70 && i >= 0) return str = "D";
        else if (i == 100) return str = "A+학점";
        if (i >= 90) {
            str = "A";
        } else if (i >= 80) {
            str = "B";
        } else if (i >= 70) {
            str = "C";
        }
        String Opt = "";
        int modval = i % 10;
        if (modval >= 8) {
            Opt = "+";
        } else if (modval <= 3) {
            Opt = "-";
        }
        String result=String.format("%s%s학점",str,Opt);
        return str + Opt + "학점";//반복문에서 문자열합치기를 쓰면 issue가 있다. 고심해서 사용하자.

    }
    String getSeason(int i){
        String str="겨울";
        if(i<=11&&i>=9) str="가을";
        if(i>=6&&i<=8) str="여름";
        if(i>=3&&i<=5) str="봄";
        if(i<1||i>12) str="없음";
        return str;
    }
}