package com.zhangyong.io.filewriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @Author 张勇
 * @Date 2019/10/18 13:11
 * @Version 1.0
 *
 * 字符流：将用户在控制台中输入的难处保存到文件中
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.next();
        FileWriter writer = new FileWriter("f.txt");
        writer.write(data);
        writer.flush();
        writer.close();
    }
}
