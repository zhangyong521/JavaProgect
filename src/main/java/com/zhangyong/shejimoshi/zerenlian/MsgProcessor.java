package com.zhangyong.shejimoshi.zerenlian;

/**
 * @Author 张勇
 * @Date 2019/10/31 20:19
 * @Version 1.0
 */
public class MsgProcessor {
    private String msg;
    public void setMsg(String msg){
        this.msg=msg;
    }
    public String process(){
        return msg.replace('<','[').replace('>',']')
                .replace("差生","后进生")
                .replace("凸o(╥﹏╥)o凸","伤心");

    }
}
