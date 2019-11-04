package com.zhangyong.shejimoshi.mingling;

/**
 * @Author 张勇
 * @Date 2019/10/19 10:06
 * @Version 1.0
 */
public abstract class ExecTime {
    public abstract void fun();
        public long exex(){
            long start = System.currentTimeMillis();
            fun();
            long end  = System.currentTimeMillis();
            return end-start;
    }
}
