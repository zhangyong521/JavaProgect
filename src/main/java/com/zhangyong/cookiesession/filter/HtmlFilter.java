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
 * @Date 2019/11/4 16:47
 * @Version 1.0
 */
@WebFilter(urlPatterns = "/*")
public class HtmlFilter implements Filter {
    @Override
    public void destroy() {
        System.out.println("HtmlFilter destroy");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("HtmlFilter doFilter before");
        chain.doFilter(req, resp);
        System.out.println("HtmlFilter doFilter after");

    }

    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("HtmlFilter init");
    }

}
