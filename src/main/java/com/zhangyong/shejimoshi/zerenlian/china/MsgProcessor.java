package com.zhangyong.shejimoshi.zerenlian.china;


/**
 * @Author 张勇
 * @Date 2019/10/31 20:19
 * @Version 1.0
 */
public class MsgProcessor {
    private String msg;
    private FilterChain filterChain;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setFilterChain(FilterChain filterChain) {
        this.filterChain = filterChain;
    }

    public String process() {
        return filterChain.doFilter(msg);
    }
}
