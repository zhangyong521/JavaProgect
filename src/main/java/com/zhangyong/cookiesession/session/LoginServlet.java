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
 * @Date 2019/11/4 15:05
 * @Version 1.0
 */
@WebServlet(urlPatterns = "/loginServlet1")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname = request.getParameter("uname");
        String upwd = request.getParameter("upwd");
        if ("zhangsan".equals(uname)&&"1234".equals(upwd)){ //如果登录成功
            HttpSession session = request.getSession();  //获取session
            session.setMaxInactiveInterval(60); //设置session的有效时间为60s
            session.setAttribute("user",uname); //用户信息放到session中

            request.getRequestDispatcher("/session.jsp").forward(request,response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
