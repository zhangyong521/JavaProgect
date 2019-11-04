package com.zhangyong.shejimoshi.chouxiang;

/**
 * @Author 张勇
 * @Date 2019/10/19 10:37
 * @Version 1.0
 */
public class XiaoMiKongTiao implements KongTiao {
    @Override
    public void zhiLeng() {
        System.out.println("小米空调 制冷");
    }

    @Override
    public void zhiRe() {
        System.out.println("小米空调 制热");
    }
}
