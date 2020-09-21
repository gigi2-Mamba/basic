package jdbc;/*
        Created by IntelliJ IDEA.
        User:码龄一个月大的BB
        Date:2020/9/21
        Time:19:28
        let' go yongbody honey
        未来可期，干他！
  */

import org.junit.Test;

import java.sql.*;

public class insert {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        PreparedStatement ps=null;

        try {
            //获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///logintest", "root", "lxj360");
            //sql语句
            String sql = "insert into user values(8,'刘学锦','123','2020-01-30')";
            //获取执行sql的对象
            ps = conn.prepareStatement(sql);



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



