package com.zhangyong.shejimoshi.chouxiang;

/**
 * @Author 张勇
 * @Date 2019/10/19 10:47
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        xiaomi();
        gree();
    }

    public static void xiaomi() {
        Factory factory = new XiaoMiFactory();
        Phone phone = factory.creatPhone();
        phone.call();
        phone.sms();
        KongTiao kongTiao = factory.creatKongTiao();
        kongTiao.zhiLeng();
        kongTiao.zhiRe();
    }

    public static void gree() {
        Factory factory = new GreeFactory();
        Phone phone = factory.creatPhone();
        phone.call();
        phone.sms();
        KongTiao kongTiao = factory.creatKongTiao();
        kongTiao.zhiRe();
        kongTiao.zhiLeng();
    }

}
