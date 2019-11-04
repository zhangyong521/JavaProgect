package com.zhangyong.cookiesession.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/demoServlet")
public class DemoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean flag = false;//表示用户未登录
        Cookie[] cookies = request.getCookies();//获取用户提交过来的所有Cooki
        if (cookies == null) {
            request.getRequestDispatcher("/login.jsp").forward(request, response);
            return;
        }
        for (Cookie item : cookies) {
            if ("user".equals(item.getName())) {//zhangsan:1234
                String[] values = item.getValue().split(":");
                if ("zhangsan".equals(values[0]) && "1234".equals(values[1])) {//Cookie信息正确，登录成功
                    flag = true;
                }
            }
        }
        if (flag) {//已经有登录信息，打开主页
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } else {//跳转到登录页面
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }

}
