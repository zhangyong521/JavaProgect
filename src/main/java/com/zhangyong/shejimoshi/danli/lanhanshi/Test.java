package com.zhangyong.shejimoshi.danli.lanhanshi;

/**
 * @Author 张勇
 * @Date 2019/10/18 21:35
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Boss boss1 = Boss.getBossInstance();
        Boss boss2 = Boss.getBossInstance();
        System.out.println(boss1 == boss2);
    }
}
