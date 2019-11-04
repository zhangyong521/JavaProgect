package com.zhangyong.shejimoshi.zerenlian;

/**
 * @Author 张勇
 * @Date 2019/10/31 20:13
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        String msg = "<script>('这是一个差生凸︶凸)</script>";
        String res = msg.replace('<','[').replace('>',']')
                .replace("差生","后进生")
                .replace("凸︶凸","伤心");//此处必须得使用replace方法，不能使用replaceAll
        System.out.println(res);
    }
}
