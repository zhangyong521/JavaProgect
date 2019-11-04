package com.zhangyong.cookiesession.filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Author 张勇
 * @Date 2019/11/4 15:36
 * @Version 1.0
 */
@WebFilter(urlPatterns = "/*")
public class AuthFilter implements Filter {
    @Override
    public void destroy() {
        System.out.println("destroy............");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println(11);
        chain.doFilter(req, resp);
        System.out.println(22);

    }

    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("init..............");
    }

}
