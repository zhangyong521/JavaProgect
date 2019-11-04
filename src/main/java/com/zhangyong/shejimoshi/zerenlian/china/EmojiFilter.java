package com.zhangyong.shejimoshi.zerenlian.china;


/**
 * @Author 张勇
 * @Date 2019/11/1 8:00
 * @Version 1.0
 * 过滤Emoji表情功能类
 */
public class EmojiFilter implements MsgFilter {

    @Override
    public String doFilter(String msg) {
        return msg.replace("凸^-^凸", "伤心");
    }
}
