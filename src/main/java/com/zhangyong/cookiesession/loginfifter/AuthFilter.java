package com.zhangyong.cookiesession.loginfifter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author 张勇
 * @Date 2019/11/4 16:57
 * @Version 1.0
 */
@WebFilter(urlPatterns = "/sec/*")
public class AuthFilter implements Filter {
    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        String aim = request.getRequestURI();
        String queryString = request.getQueryString();
        if (queryString!=null){
            aim+="?"+queryString;
        }

        HttpSession session = request.getSession();
        session.setAttribute("aim",aim);

        Object user = session.getAttribute("user");
        if (user==null){
            request.getRequestDispatcher("/fifterlogin.jsp").forward(request,response);
            return; //如果有过滤器链，不在执行后面的过滤器
        }
        chain.doFilter(req,resp);
        System.out.println("haha");
    }

    @Override
    public void init(FilterConfig config) throws ServletException {

    }

}
