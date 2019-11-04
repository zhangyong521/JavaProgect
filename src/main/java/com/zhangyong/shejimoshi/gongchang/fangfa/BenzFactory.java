package com.zhangyong.shejimoshi.gongchang.fangfa;

/**
 * @Author 张勇
 * @Date 2019/10/18 22:39
 * @Version 1.0
 */
public class BenzFactory implements TrafficFactory {

    @Override
    public Traffic create() {
        return new Benz();
    }
}
