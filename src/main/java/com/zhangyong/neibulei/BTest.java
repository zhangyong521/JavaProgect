package com.zhangyong.neibulei;

/**
 * @Author 张勇
 * @Date 2019/10/22 22:15
 * @Version 1.0
 */
public class BTest {
    public static void main(String[] args) {

        class C implements B{
            @Override
            public void fun() {//重写父类方法
                System.out.println("C fun");
            }
        }
        C c = new C();
        c.fun();

        B b1=new B(){
            @Override
            public void fun() {
                System.out.println("B1 fun");
            }
        };
        b1.fun();

        new B(){

            @Override
            public void fun() {
                System.out.println("简单写法");
            }
        }.fun();

    }
}
