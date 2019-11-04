package com.zhangyong.shejimoshi.chouxiang;

/**
 * @Author 张勇
 * @Date 2019/10/19 10:39
 * @Version 1.0
 */
public class GreeMiPhone implements Phone {
    @Override
    public void call() {
        System.out.println("格力手机 打电话");
    }

    @Override
    public void sms() {
        System.out.println("格力手机 发短信");
    }
}
