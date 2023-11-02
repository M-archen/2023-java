package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    public static int insBoard(BoardEntity entity){// entity에는 BoardEntity 객체 주소값 들어있음. (title,ctnts,writer)
        int result=0;

        String sql="INSERT INTO board(title, ctnts, writer)"+ "VALUES"+ "(?,?,?)";//prepareStatement 덕분에 ?,?,?에 문자열을 넣을 수 있다.
                                                                                    //ps.set타입이름(물음표순서,넣을값);

        String sql2="INSERT INTO board(title, ctnts, writer)"+
                "VALUES('"+entity.getTitle()+"','" + entity.getCtnts()+"','"+
                entity.getWriter()+"')";
        Connection con=null;
        PreparedStatement ps=null;

        try{
        con= MyConn.getConn();
        ps=con.prepareStatement(sql);
        ps.setString(1,entity.getTitle());
        ps.setString(2,entity.getCtnts());
        ps.setString(3,entity.getWriter());//물음표에 값을 다 넣어줬다.

        result=ps.executeUpdate();//쿼리문 실행.
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            MyConn.close(con,ps);
        }
        return result;
    }

    public static int delBoard(BoardEntity entity) {
        int result=0;
        Connection con=null;
        PreparedStatement ps=null;
        String sql="DELETE FROM board WHERE iboard =?";

        try{
            con= MyConn.getConn();
            ps=con.prepareStatement(sql);
            ps.setInt(1,entity.getIboard());
            result=ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            MyConn.close(con,ps);
        }
        return result;

    }
    public static List<BoardEntity> selBoardList() {
        List<BoardEntity> list = new ArrayList();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT iboard, title, writer, created_at FROM board";
        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()) {
                int iboard = rs.getInt("iboard");
                String title = rs.getString("title");
                String writer = rs.getString("writer");
                String createdAt = rs.getString("created_at");

                BoardEntity entity = new BoardEntity();
                entity.setIboard(iboard);
                entity.setTitle(title);
                entity.setWriter(writer);
                entity.setCreatedAt(createdAt);

                list.add(entity);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps, rs);
        }
        return list;
    }
    public static BoardEntity selBoardById(int iboard) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = " SELECT iboard, title, writer, ctnts, created_at, updated_at " +
                " FROM board WHERE iboard = ?";
        try {
            conn = MyConn.getConn();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, iboard);
            rs = ps.executeQuery();
            if(rs.next()) {
                BoardEntity entity = new BoardEntity();
                entity.setIboard(iboard);
                entity.setTitle(rs.getString("title"));
                entity.setCtnts(rs.getString("ctnts"));
                entity.setWriter(rs.getString("writer"));
                entity.setCreatedAt(rs.getString("created_at"));
                entity.setUpdatedAt(rs.getString("updated_at"));
                return entity;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(conn, ps, rs);
        }
        return null;
    }


    public static int updBoard(BoardEntity entity) {
        int result=0;
        Connection con=null;
        PreparedStatement ps=null;
        String sql="UPDATE board "+"SET title = ? "+", ctnts = ? "+", writer = ? "+", updated_at = now() "+"WHERE iboard = ? ";

        try{
            con= MyConn.getConn();
            ps=con.prepareStatement(sql);
            ps.setString(1,entity.getTitle());
            ps.setString(2,entity.getCtnts());
            ps.setString(3,entity.getWriter());
            ps.setInt(4,entity.getIboard());

            result=ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            MyConn.close(con,ps);
        }
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
class MyConnTest3{
    public static void main(String[] args) {
        BoardEntity entity = new BoardEntity();
        entity.setIboard(4);
        int row=BoardDao.delBoard(entity);
    }
}

class MyConnTest4{
    public static void main(String[] args) {
        BoardEntity entity=new BoardEntity();
        entity.setIboard(5);
        entity.setTitle("수정제목");
        entity.setCtnts("수정내용");
        entity.setWriter("수정자");

        int row=BoardDao.updBoard(entity);
    }
}
class MyConnTest5{
    public static void main(String[] args) {
        List<BoardEntity> list=BoardDao.selBoardList();

        for(BoardEntity entity : list){
            System.out.println(entity.toString()); //iboard:1, title:ㅁㄴㅇㄹㄴㄹ
        }
    }
}

class MyConnTest6{
    public static void main(String[] args) {
        BoardEntity result=BoardDao.selBoardById(5);
        System.out.println(result);
    }
}
