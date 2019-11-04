package com.zhangyong.shejimoshi.guanchazhe;

/**
 * @Author 张勇
 * @Date 2019/11/1 21:37
 * @Version 1.0
 *
 * 定义观察者
 */
public class UserInterface implements Observer {
    private String name;
    private String msg;

    public UserInterface(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.msg = message;
        System.out.println(name + "收到推送消息：" + msg);
    }
}
