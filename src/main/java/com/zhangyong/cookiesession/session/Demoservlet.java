package com.zhangyong.cookiesession.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author 张勇
 * @Date 2019/11/4 15:10
 * @Version 1.0
 */
@WebServlet("/demoServlet1")
public class Demoservlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Object user = session.getAttribute("user");
        if (user!=null){
            req.getRequestDispatcher("/session.jsp").forward(req,resp);
        }else {
            resp.sendRedirect("/sessionlogin.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
