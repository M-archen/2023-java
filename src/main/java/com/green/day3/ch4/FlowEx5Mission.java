package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5Mission {
    public static void main(String[] args){

        //남자의 평균키는 170, 여자의 평균키  157.
        //Scanner이용하여 성별을 입력 받습니다. (남자,여자)
        //키를 입력받습니다.
        //평균 키 이하면"156cm는 남평균 이하입니다."
        //평균키와 같다면,"170cm는 평균입니다.

        Scanner scan=new Scanner(System.in);//값을 받는사람(값은 한명만 고용해도 됨.) ..//브라우저나 콘솔 창에서 입력한 언어는
                                                                                  //무조건 문자열로 받아짐.
        String gender=scan.nextLine();
        int height=scan.nextInt();

        if(gender.equals("남자"))
        {
            if(height>170){
                System.out.printf("%dcm는 %s 평균 초과입니다.",height,gender);
            }else if(height<170){
                System.out.printf("%dcm는 %s 평균 미만입니다.",height,gender);
            }else System.out.printf("%dcm는 %s 평균입니다.",height,gender);

        }
        if(gender.equals("여자")){
            if(height>156){
                System.out.printf("%dcm는 %s 평균 초과입니다.",height,gender);
            }else if(height<156){
                System.out.printf("%dcm는 %s 평균 미만입니다.",height,gender);
            }else System.out.printf("%dcm는 %s 평균입니다.",height,gender);

        }




    }
}
