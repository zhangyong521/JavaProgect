package com.zhangyong.shejimoshi.danli.ehanshi;

/**
 * @Author 张勇
 * @Date 2019/10/18 21:26
 * @Version 1.0
 *
 * 饿汉式
 */
public class Boss {
    //静态变量在类的所有对象中只有一份
    private static Boss boss = new Boss();
    private Boss(){
    }
    public static Boss getBossInstance(){
        return boss;
    }
}
