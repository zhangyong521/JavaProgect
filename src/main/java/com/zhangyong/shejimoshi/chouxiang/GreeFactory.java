package com.zhangyong.shejimoshi.chouxiang;

/**
 * @Author 张勇
 * @Date 2019/10/19 10:45
 * @Version 1.0
 */
public class GreeFactory implements Factory {
    @Override
    public Phone creatPhone() {
        return new GreeMiPhone();
    }

    @Override
    public KongTiao creatKongTiao() {
        return new GreeKongTiao();
    }
}
