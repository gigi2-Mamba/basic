package Servlet;

import dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
        Created by IntelliJ IDEA.
        User:码龄一个月大的BB
        Date:2020/9/23
        Time:10:35
        let' go yongbody honey
        未来可期，干他！
  */
@WebServlet("/deleteServlet")
public class deleteServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        try {
            String username= req.getParameter("username");
            int id =Integer.parseInt(req.getParameter("id"));
            UserDao dao =new UserDao();
            dao.delete("username",id);
            req.getRequestDispatcher("/UserServlet").forward(req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);

    }
}