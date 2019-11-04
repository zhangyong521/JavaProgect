package com.zhangyong.jiekou;

/**
 * @Author 张勇
 * @Date 2019/10/22 21:39
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        NewClass obj = new NewClass();
        obj.fun1();
        obj.fun2();
        NewInter.fun3();

        System.out.println(NewInter.PAGE_NUM);
    }
}
