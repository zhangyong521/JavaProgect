package com.zhangyong.io.bufferedwriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

/**
 * @Author 张勇
 * @Date 2019/10/18 13:18
 * @Version 1.0
 *
 * 字符流：将随机生成的字符串保存到文件中
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\IO\\f.txt");
        FileWriter writer = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(writer);
        for (int i = 0; i < 1000000; i++) {
            String s = UUID.randomUUID().toString();
            bw.write(s);
        }
        bw.flush();
        bw.close();
    }

}
