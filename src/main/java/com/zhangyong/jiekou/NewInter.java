package com.zhangyong.jiekou;

/**
 * @Author 张勇
 * @Date 2019/10/22 21:34
 * @Version 1.0
 */
public interface NewInter {
    int PAGE_NUM = 1234;
    void fun1();
    default void fun2(){//普通方法
        System.out.println("fun2");
    }
    //接口中的静态方法只能通过接口调用

    static void fun3(){
        System.out.println("fun3");
    }

}
