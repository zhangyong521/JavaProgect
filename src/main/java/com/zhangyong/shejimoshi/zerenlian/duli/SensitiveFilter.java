package com.zhangyong.shejimoshi.zerenlian.duli;

import com.zhangyong.shejimoshi.zerenlian.duli.MsgFilter;

/**
 * @Author 张勇
 * @Date 2019/11/1 7:51
 * @Version 1.0
 * 过滤敏感字的功能类
 */
public class SensitiveFilter implements MsgFilter {
    @Override
    public String doFilter(String msg) {
        return msg.replaceAll("差生","后进生");
    }
}
