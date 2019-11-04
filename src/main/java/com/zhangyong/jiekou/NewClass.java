package com.zhangyong.jiekou;

/**
 * @Author 张勇
 * @Date 2019/10/22 21:37
 * @Version 1.0
 */
public class NewClass implements NewInter {
    @Override
    public void fun1() { //实现接口中的方法

    }

    @Override
    public void fun2() {//重写接口中的默认方法
        System.out.println("重写接口中的默认方法");

    }
}
