package Servlet;

import dao.UserDao;
import domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 查询数据库，将数据库查询的数据封装到一个对象中，将对象封装到集合中
        req.setCharacterEncoding("utf-8");
        UserDao dao = new UserDao();
        List<User> list = dao.getUsers();
        // 将集合数据保存到页面上

        HttpSession session = req.getSession();
        session.setAttribute("list", list);
//        req.setAttribute("list",list);

        System.out.println(list);
        // 转发到页面
        req.getRequestDispatcher("list.jsp").forward(req, resp);
    }


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);

    }
}