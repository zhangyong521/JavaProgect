package com.zhangyong.shejimoshi.chouxiang;

/**
 * @Author 张勇
 * @Date 2019/10/19 10:41
 * @Version 1.0
 */
public class XiaoMiFactory implements Factory {
    @Override
    public Phone creatPhone() {
        return new XiaoMiPhone();
    }

    @Override
    public KongTiao creatKongTiao() {
        return new XiaoMiKongTiao();
    }
}
