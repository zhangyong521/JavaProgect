package com.zhangyong.shejimoshi.gongchang.fangfa;

/**
 * @Author 张勇
 * @Date 2019/10/18 22:29
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        TrafficFactory factory;
        //factory = new BWMFactory();
        //factory = new BenzFactory();
        factory = new BWMFactory();
        Traffic traffic = factory.create();
        traffic.run();
        traffic.brake();
    }

}
