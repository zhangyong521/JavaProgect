package com.zhangyong.javafanshe;

import java.util.Date;
import java.util.Random;

/**
 * @Author 张勇
 * @Date 2019/10/18 23:07
 * @Version 1.0
 */
public class demo {
    public static void main(String[] args) throws Exception {
        //leiming();
        duixiang();
    }
    //获取对象的类名
    public static void leiming(){
        Date date = new Date();
        System.out.println(date.getClass().getName()); //包名+类名
        System.out.println(date.getClass().getSimpleName());//类名
    }
    public static void duixiang() throws Exception{
        String className="java.util.Random";
        Random random = (Random) Class.forName(className).newInstance();
        for (int i=0;i<10;i++){
            int digit = random.nextInt(100) + 100;
            System.out.println(digit);
        }
    }
}
