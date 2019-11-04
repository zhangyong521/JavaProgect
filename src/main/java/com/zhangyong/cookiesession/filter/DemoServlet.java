package com.zhangyong.cookiesession.filter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author 张勇
 * @Date 2019/11/4 16:50
 * @Version 1.0
 */
@WebServlet(urlPatterns = "/DemoFilter")
public class DemoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("hahhah.....");
    }
}
