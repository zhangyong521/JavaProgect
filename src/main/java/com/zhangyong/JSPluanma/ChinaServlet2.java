package com.zhangyong.JSPluanma;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;

/**
 * @Author 张勇
 * @Date 2019/11/5 8:49
 * @Version 1.0
 */
@WebServlet(urlPatterns = "/chinaServlet2")
public class ChinaServlet2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String k1 = request.getParameter("k1");
        System.out.println(k1);
        String k2 = request.getParameter("k2");
        String res=new String(k2.getBytes("UTF-8"),"UTF-8");
        System.out.println(res);
    }
}
