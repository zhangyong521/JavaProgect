package com.zhangyong.shejimoshi.zhuangshi;

/**
 * @Author 张勇
 * @Date 2019/10/18 14:17
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        FileWriter2 writer2 = new FileWriter2();
        //writer2.write();
        BufferedWriter2 bufferedWriter2 = new BufferedWriter2(writer2);
        bufferedWriter2.write();
    }

}
