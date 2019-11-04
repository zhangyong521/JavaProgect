package com.zhangyong.shejimoshi.danli.xiugailanhanshi;

/**
 * @Author 张勇
 * @Date 2019/10/27 19:06
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //利用匿名内部类的方式
        new Thread(new Runnable(){

            @Override
            public void run() {
                Boss boss1 = Boss.getBossInstance();
                System.out.println(boss1);
            }
        }).start();

        new Thread(()->{
            Boss boss2 = Boss.getBossInstance();
            System.out.println(boss2);
        }).start();

    }

}
