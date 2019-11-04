package com.zhangyong.shejimoshi.zerenlian.duli;

/**
 * @Author 张勇
 * @Date 2019/11/1 8:10
 * @Version 1.0
 */
public class Test {
    private static String msg="<script>alert('这是一个差生凸^-^凸')</script>";

    public static void main(String[] args) {
        MsgProcessor processor = new MsgProcessor();
        processor.setMsg(msg);
        String res = processor.process();
        System.out.println(res);
    }
}
