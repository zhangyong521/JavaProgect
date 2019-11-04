package com.zhangyong.shejimoshi.danli.lanhanshi;

/**
 * @Author 张勇
 * @Date 2019/10/18 21:32
 * @Version 1.0
 */
public class Boss {
    //静态变量在类的所有对象中只有一份
    private static Boss boss;
    private Boss(){

    }
    public static Boss getBossInstance(){
        if (boss ==null){
            boss=new Boss();
        }
        return boss;
    }
}
