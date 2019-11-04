package com.zhangyong.shejimoshi.gongchang.jiandan;


/**
 * @Author 张勇
 * @Date 2019/10/18 21:55
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        String type="Audi";
        Traffic traffic = TrafficFactory.create(type);
        traffic.brake();
        traffic.run();
    }
}
