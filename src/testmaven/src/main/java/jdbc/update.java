package jdbc;/*
        Created by IntelliJ IDEA.
        User:码龄一个月大的BB
        Date:2020/9/21
        Time:20:15
        let' go yongbody honey
        未来可期，干他！
  */

import java.sql.*;

public class update {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        PreparedStatement ps=null;

        try {
            //获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///logintest", "root", "lxj360");
            //sql语句
            String sql = "update  user set username=3 where id=1";
            //获取执行sql的对象
            ps = conn.prepareStatement(sql);
            int i = ps.executeUpdate();
            System.out.println("影响了"+i+"行");


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
