package com.zhangyong.shejimoshi.zerenlian.duli;

import com.zhangyong.shejimoshi.zerenlian.duli.MsgFilter;

/**
 * @Author 张勇
 * @Date 2019/11/1 7:53
 * @Version 1.0
 * 过滤特殊字符的功能类
 */
public class HtmlFilter implements MsgFilter {
    @Override
    public String doFilter(String msg) {
        return msg.replace('<','[').replace('>',']');
    }
}
