package dao;


import domain.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDao {
    public List<User> getUsers(){
        List<User> list = new ArrayList<>();
        // 操作数据库的代码
        try {
            // 链接上数据库
            Class.forName("com.mysql.jdbc.Driver");
            // 获取数据库的链接
            Connection conn =  DriverManager.getConnection("jdbc:mysql:///logintest",
                    "root", "lxj360");
            // 准备sql语句
            String sql = "select * from user";
            // 预编译sql语句
            PreparedStatement pstmt =  conn.prepareStatement(sql);
            // 执行sql语句
            ResultSet rs =  pstmt.executeQuery();
            // 使用循环的方式从rs中获取数据
            while (rs.next()){
                User user = new User(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getTimestamp("birthday"));
                        // 将user对象放入list集合中
                        list.add(user);

            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public void save(String username, String password, Date birth) throws Exception{
        // 链接上数据库
        Class.forName("com.mysql.jdbc.Driver");
        // 获取数据库的链接
        Connection conn =  DriverManager.getConnection("jdbc:mysql:///logintest",
                "root", "lxj360");
        // 保存数据
        String saveSql = "insert into user(username,password,birthday) values(?,?,?)";

        PreparedStatement pstmt =  conn.prepareStatement(saveSql);

        // 给占位符赋值
        pstmt.setString(1,username);
        pstmt.setString(2,password);
        pstmt.setObject(3,birth);

        // 执行sql语句
        pstmt.executeUpdate();

        conn.close();

    }
    public void delete(String username, int id) throws Exception{
        // 链接上数据库
        Class.forName("com.mysql.jdbc.Driver");
        // 获取数据库的链接
        Connection conn =  DriverManager.getConnection("jdbc:mysql:///logintest",
                "root", "lxj360");
        // 保存数据
        String saveSql = "delete from user where username = ? and id = ?";

        PreparedStatement pstmt =  conn.prepareStatement(saveSql);

        // 给占位符赋值
        pstmt.setString(1,username);
        pstmt.setInt(2,id);


        // 执行sql语句
        pstmt.executeUpdate(); // 适合 insert delete update的操作

        conn.close();

    }

    public void update(String username, int id) throws Exception{
        // 链接上数据库
        Class.forName("com.mysql.jdbc.Driver");
        // 获取数据库的链接
        Connection conn =  DriverManager.getConnection("jdbc:mysql:///logintest",
                "root", "lxj360");
        // 保存数据
        String Sql = "update user set username = ? where id = ?";

        PreparedStatement pstmt =  conn.prepareStatement(Sql);

        // 给占位符赋值
        pstmt.setString(1,username);
        pstmt.setInt(2,id);


        // 执行sql语句
        pstmt.executeUpdate(); // 适合 insert delete update的操作

        conn.close();

    }

}
