package com.zhangyong.shejimoshi.danli.xiugailanhanshi;

/**
 * @Author 张勇
 * @Date 2019/10/27 19:01
 * @Version 1.0
 *
 * 利用双重锁来实现懒汉式的唯一性
 */
public class Boss {
    private volatile static Boss boss;

    private Boss(){

    }
    public static Boss getBossInstance(){
        if (boss==null){
            synchronized (Boss.class){
                try {
                    //程序休息，别人更容易抢到CPU
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (boss==null){
                    boss= new Boss();
                }
            }
        }
        return boss;
    }
}
