package com.zhangyong.shejimoshi.chouxiang;

/**
 * @Author 张勇
 * @Date 2019/10/19 10:35
 * @Version 1.0
 */
public class XiaoMiPhone implements Phone {
    @Override
    public void call() {
        System.out.println("小米手机 打电话");
    }

    @Override
    public void sms() {
        System.out.println("小米手机 发短信");
    }
}
