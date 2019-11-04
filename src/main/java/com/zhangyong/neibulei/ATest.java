package com.zhangyong.neibulei;

/**
 * @Author 张勇
 * @Date 2019/10/22 21:45
 * @Version 1.0
 */
public class ATest {
    public static void main(String[] args) {
        System.out.println("------内部类实现A中的方法--------");
        class B extends A{

        }
        B b = new B();
        b.fun();
        System.out.println("------内部类实现A中的方法并重写--------");
        class B2 extends A{
            @Override
            public void fun() {
                System.out.println("B2 fun");
            }
        }
        B2 b2 = new B2();
        b2.fun();

        System.out.println("------匿名内部类实现A中的方法--------");
        A a = new A(){

        };
        a.fun();
        System.out.println("------匿名内部类实现A中的方法并重写--------");
        A a1 = new A(){
            @Override
            public void fun() {
                System.out.println("a1 fun");
            }
        };
        a1.fun();
        System.out.println("------简单形式匿名内部类实现A中的方法--------");

        new A(){

        }.fun();

        System.out.println("------简单形式匿名内部类实现A中的方法并重写--------");

        new A(){
            @Override
            public void fun() {
                System.out.println("A 重写");
            }
        }.fun();
    }

}
