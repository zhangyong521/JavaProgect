package com.zhangyong.cookiesession.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author 张勇
 * @Date 2019/11/4 14:13
 * @Version 1.0
 */
@WebServlet(urlPatterns = "/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String jiZhu = request.getParameter("jiZhu");

        String uname = request.getParameter("uname");
        String upwd = request.getParameter("upwd");

        if ("zhangsan".equals(uname) && "1234".equals(upwd)) {//如果登录成功
            if ("jiZhu".equals(jiZhu)) {//用户选择了记住登录状态
                Cookie cookie = new Cookie("user", uname + ":" + upwd);
                cookie.setMaxAge(60*60*24*7);//Cookie保存时间一周
                response.addCookie(cookie);//将Cookie信息发送到客户端
            }
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }
}
