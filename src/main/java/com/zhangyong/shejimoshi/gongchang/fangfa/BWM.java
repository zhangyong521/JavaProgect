package com.zhangyong.shejimoshi.gongchang.fangfa;


import com.zhangyong.shejimoshi.gongchang.gaijin.Traffic;

/**
 * @Author 张勇
 * @Date 2019/10/18 21:44
 * @Version 1.0
 */
public class BWM implements Traffic, com.zhangyong.shejimoshi.gongchang.fangfa.Traffic {
    @Override
    public void run() {
        System.out.println("BWM run");
    }

    @Override
    public void brake() {
        System.out.println("BWM brake");
    }
}
