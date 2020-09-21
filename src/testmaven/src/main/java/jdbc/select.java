package jdbc;/*
        Created by IntelliJ IDEA.
        User:码龄一个月大的BB
        Date:2020/9/21
        Time:20:04
        let' go yongbody honey
        未来可期，干他！
  */

import java.sql.*;

public class select {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        PreparedStatement ps=null;
       ResultSet rs=null;
        try {
            //获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///logintest", "root", "lxj360");
            //sql语句
            String sql = "select * from user";
            //获取执行sql的对象
            ps = conn.prepareStatement(sql);

            rs = ps.executeQuery();
            while (rs.next()){
                System.out.print(rs.getInt("id")+"\t");
                System.out.print(rs.getString("username")+"\t");
                System.out.print(rs.getTimestamp("birthday")+"\t");
            }




        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
    }

