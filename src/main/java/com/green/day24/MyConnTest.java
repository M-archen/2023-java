package com.green.day24;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyConnTest {
    public static void main(String[] args) {
        //MyConn에 있는 getConn 메소드 호출하시고 메소드가 리턴해주는 값 담아보세요.
        Connection conn=MyConn.getConn();// 스태틱 메소드라 객체화 필요없다.
        String sql="INSERT INTO country (country_id,country)"+ "VALUES (110,'경현나라')";
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            int result=ps.executeUpdate();
            System.out.println("result : "+result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
