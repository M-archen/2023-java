package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardDao {
    public static int insBoard(BoardEntity entity) throws SQLException {// entity에는 BoardEntity 객체 주소값 들어있음. (title,ctnts,writer)
        int result=0;

        String sql=String.format("INSERT INTO board(title, ctnts, writer)"+
                                "VALUES"+
                                "(?,?,?)"
                ,entity.getTitle(),entity.getCtnts(),entity.getWriter());

        String sql2="INSERT INTO board(title, ctnts, writer)"+
                "VALUES('"+entity.getTitle()+"','" + entity.getCtnts()+"','"+
                entity.getWriter()+"')";


        Connection con= MyConn.getConn();
        PreparedStatement ps=con.prepareStatement(sql);
        result=ps.executeUpdate();
        return result;
    }
}

class MyConnTest2{
    public static void main(String[] args) throws SQLException {
        //title : 처음작성
        //ctnts : 처음 작성하는 내용입니다.
        //writer : 홍길동
        String title="오늘 Insert배움";
        String ctnts="아시발 존나어렵네 ㅋㅋ.";
        String writer="힘드노";
        BoardEntity be=new BoardEntity();
        be.setWriter(writer);
        be.setTitle(title);
        be.setCtnts(ctnts);
        BoardDao.insBoard(be);


    }
}
