package com.zhangyong.shejimoshi.zhuangshi;

import org.omg.CORBA.ARG_OUT;

import java.io.BufferedWriter;

/**
 * @Author 张勇
 * @Date 2019/10/18 14:22
 * @Version 1.0
 */
public class BufferedWriter2 extends writer2 {
    private writer2 writer2;

    public BufferedWriter2(writer2 writer2) {
        this.writer2=writer2;
    }

    @Override
    public void write() {
        System.out.println("新的增强功能");
    }
}
