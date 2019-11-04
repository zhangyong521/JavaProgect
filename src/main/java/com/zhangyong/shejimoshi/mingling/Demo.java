package com.zhangyong.shejimoshi.mingling;

/**
 * @Author 张勇
 * @Date 2019/10/19 10:02
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 99999; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("***" + (end - start));
    }
}
