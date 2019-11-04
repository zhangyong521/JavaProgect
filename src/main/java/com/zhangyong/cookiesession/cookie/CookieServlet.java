package com.zhangyong.cookiesession.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

/**
 * @Author 张勇
 * @Date 2019/11/4 10:54
 * @Version 1.0
 */
@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        Arrays.stream(cookies).forEach(System.out::println);
        Arrays.stream(cookies).forEach((item)->System.out.println(item.getName()+""+item.getValue()));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("name", "lisi");
        //将cookie发送到客户端浏览器
        response.addCookie(cookie);
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }
}
