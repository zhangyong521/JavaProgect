package com.zhangyong.shejimoshi.chouxiang;

/**
 * @Author 张勇
 * @Date 2019/10/19 10:40
 * @Version 1.0
 */
public class GreeKongTiao implements KongTiao {
    @Override
    public void zhiLeng() {
        System.out.println("格力空调 制冷");
    }

    @Override
    public void zhiRe() {
        System.out.println("格力空调 制热");
    }
}
