package com.zhangyong.cookiesession.loginfifter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author 张勇
 * @Date 2019/11/4 17:08
 * @Version 1.0
 */
@WebServlet(urlPatterns = "/loginFifter")
public class LoginFifter extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname = request.getParameter("uname");
        String upwd = request.getParameter("upwd");

        if ("zhangsan".equals(uname) && "1234".equals(upwd)) {//如果登录成功
            HttpSession session = request.getSession(); //获取Session
            session.setMaxInactiveInterval(30*60); //设置session的有效时间为60s
            session.setAttribute("user",uname);//将用户信息放到Session中

            Object aim = request.getSession().getAttribute("aim");//filter拦截的url
            System.out.println("***"+aim);

            request.getRequestDispatcher(aim.toString()).forward(request, response);
        }
    }

}
