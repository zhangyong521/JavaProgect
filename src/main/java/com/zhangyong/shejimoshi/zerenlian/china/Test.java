package com.zhangyong.shejimoshi.zerenlian.china;

/**
 * @Author 张勇
 * @Date 2019/11/1 8:19
 * @Version 1.0
 */
public class Test {
    private static String msg="<script>alert('这是一个差生凸^-^凸')</script>";

    public static void main(String[] args) {
        FilterChain filterChain1 = new FilterChain();
        filterChain1.addFilter(new SensitiveFilter());
        filterChain1.addFilter(new HtmlFilter());

        FilterChain filterChain2=new FilterChain();
        filterChain2.addFilter(new EmojiFilter());

        filterChain1.addFilter(filterChain2);

        MsgProcessor processor = new MsgProcessor();
        processor.setMsg(msg);
        processor.setFilterChain(filterChain1);

        String res = processor.process();
        System.out.println(res);

    }
}
