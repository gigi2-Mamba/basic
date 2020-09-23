package Servlet;

import dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
        Created by IntelliJ IDEA.
        User:码龄一个月大的BB
        Date:2020/9/23
        Time:9:39
        let' go yongbody honey
        未来可期，干他！
  */
@WebServlet("/addServlet")
public class addServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        try {
            //接收页面提交的参数
            String username = req.getParameter("username");
            String password = req.getParameter("password");
            Date birthday =  new SimpleDateFormat("yyyy-MM-dd").parse(req.getParameter("birthday")) ;

            //将接收的3个参数传递到 UserDao 中将数据保存
            UserDao dao = new UserDao();
            dao.save(username,password,birthday);

            // 转发到列表页面
            req.getRequestDispatcher("/UserServlet").forward(req,resp);

        } catch (Exception e){
            e.printStackTrace();
        }

    }


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);

    }
}