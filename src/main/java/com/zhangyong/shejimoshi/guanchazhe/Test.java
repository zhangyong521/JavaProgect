package com.zhangyong.shejimoshi.guanchazhe;

/**
 * @Author 张勇
 * @Date 2019/11/1 21:20
 * @Version 1.0
 *
 * 测试代码
 */
public class Test {
    public static void main(String[] args) {
        BusinessServer server = new BusinessServer();

        Observer zhangsan = new UserInterface("zhangsan");
        Observer lisi = new UserInterface("lisi");

        server.registerObserver(zhangsan);
        server.registerObserver(lisi);

        server.setMsg("梁云亮是一个非常负责任的老师");

        System.out.println("----------------");
        server.removeObserver(zhangsan);
        server.setMsg("梁云亮老师的技术水平很牛！");
    }
}
