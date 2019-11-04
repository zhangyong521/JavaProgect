package com.zhangyong.shejimoshi.gongchang.gaijin;


/**
 * @Author 张勇
 * @Date 2019/10/18 21:44
 * @Version 1.0
 */
public class Benz implements Traffic {
    @Override
    public void run() {
        System.out.println("Benz run");
    }

    @Override
    public void brake() {
        System.out.println("Benz brake");
    }
}
