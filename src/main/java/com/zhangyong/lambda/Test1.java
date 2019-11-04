package com.zhangyong.lambda;

/**
 * @Author 张勇
 * @Date 2019/10/24 21:13
 * @Version 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        //匿名内部类
        Runnable obj = new Runnable(){
            @Override
            public void run() {
                System.out.println("run1");
            }
        };
        obj.run();

        //Lambda表达式
        Runnable obj2=()->{
            System.out.println("run2");
        };
        obj2.run();
    }
}
