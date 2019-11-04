package com.zhangyong.shejimoshi.zerenlian;

/**
 * @Author 张勇
 * @Date 2019/10/31 20:24
 * @Version 1.0
 */
public class MsgProcessorTest {
    private static String msg="<script>alert('这是一个差生凸^-^凸')</script>";

    public static void main(String[] args) {
        MsgProcessor processor = new MsgProcessor();
        processor.setMsg(msg);
        String res = processor.process();
        System.out.println(res);
    }
}
