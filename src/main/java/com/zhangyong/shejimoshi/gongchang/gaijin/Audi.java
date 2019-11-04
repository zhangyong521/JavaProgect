package com.zhangyong.shejimoshi.gongchang.gaijin;


/**
 * @Author 张勇
 * @Date 2019/10/18 21:43
 * @Version 1.0
 */
public class Audi implements Traffic {
    @Override
    public void run() {
        System.out.println("Audi run");
    }

    @Override
    public void brake() {
        System.out.println("Audi brake");
    }
}

