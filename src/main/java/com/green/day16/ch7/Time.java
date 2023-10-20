package com.green.day16.ch7;

public class Time {
    public final static int MIN_HOUR=0;
    public final static int MAX_HOUR=23;

    private int hour,minute,second;// 속성은 은닉화를 해야함. why? 그래야 외부에서 날림으로 수정되는것을 막을 수 있다.


    //      1.생성자 이용. ..
    public Time(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    //      2.setter 메소드 이용. . .
    public void setHour(final int hour){// setter는 전부다  void임 들어오는건 있지만 멤버필드의 값만 변경하면 됨.
        if(hour<MIN_HOUR){this.hour=MIN_HOUR; return;}
        if(hour>MAX_HOUR){this.hour=MAX_HOUR; return;}
        this.hour=hour;
    }
    public void setMinute(int minute){
        this.minute=minute;
    }
    public void setSecond(int second){
        this.second=second;
    }


    //      --getter--메소드 이용 . . .

    public int getHour() {
        return hour;
    }// 파라미터가 없다. 이름에 정보가 이미 있음. 리턴타입은 변수의 타입.

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String toString(){
        return String.format("%02d:%02d:%02d",hour,minute,second);// 스태틱 메소드. 속도 bb 권장 bb  instance 만 안쓰면
    }
}
class TimeTest{
    public static void main(String[] args) {
        Time time=new Time(10,20,30);//객체화
        //  time.hour=10 << 접근안됨. why?? private이기때문. 같은 클래스만 접근가능.
        //  그러면 값을 어떻게 전달해야 할까??
        //  1.생성자를 이용한다.
        time.setMinute(30);
        System.out.println(time);//10시 20분 30초

        time.setHour(30);//0~23, 만약 23 초과값이 들어오면 23이, 0 미만값이 들어가면 0이 들어가도록.
        System.out.println(time);

        time.setHour(-1557);
        System.out.println(time); //23:30:00

    }
}
