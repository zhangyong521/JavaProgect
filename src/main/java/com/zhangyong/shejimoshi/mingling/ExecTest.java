package com.zhangyong.shejimoshi.mingling;


/**
 * @Author 张勇
 * @Date 2019/10/19 10:09
 * @Version 1.0
 *
 * 设计模式：测试设计模式
 */
public class ExecTest {

    public static void main(String[] args) {
        //ceshi1();
        //ceshi2();
        ceshi3();
    }
    public static void ceshi1(){
        //内部类
        class forExecTime extends ExecTime{

            @Override
            public void fun() {
                for (int i=0;i<9999;i++){
                    System.out.println(i);
                }
            }
        }
        forExecTime obj = new forExecTime();
        long res = obj.exex();
        System.out.println(res);
    }
    public static void ceshi2(){
        //内部类
        ExecTime obj = new ExecTime(){

            @Override
            public void fun() {
                for (int i=0;i<9999;i++){
                    System.out.println(i);
                }
            }
        };
        long res = obj.exex();
        System.out.println(res);
    }
    public static void ceshi3(){
        //内部类
        long res =new  ExecTime(){

            @Override
            public void fun() {
                for (int i=0;i<9999;i++){
                    System.out.println(i);
                }
            }
        }.exex();
        System.out.println(res);
    }
}
