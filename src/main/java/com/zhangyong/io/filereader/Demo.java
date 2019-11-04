package com.zhangyong.io.filereader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author 张勇
 * @Date 2019/10/18 13:25
 * @Version 1.0
 * <p>
 * 读取文件
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        //fangfa1();
        //fangfa2();
        fangfa3();
    }
    //方式一：了解（一次读取一个字符）

    public static void fangfa1() throws IOException {
        File file = new File("D:\\IO\\f.txt");
        FileReader reader = new FileReader(file);

        int read = reader.read();
        System.out.println((char) read);

        //遍历文件当中的所有数字
        while (read != -1) {
            read = reader.read();
            System.out.println((char) read);
        }
        reader.close();
    }

    //方式二：了解（采用char字符查询，每次查询64位）

    public static void fangfa2() throws IOException {
        File file = new File("D:\\IO\\f.txt");
        FileReader reader = new FileReader(file);

        char[] buf = new char[64];
        int len = reader.read(buf); //将数据读取到buf中，返回读取到的字符的个数

        while (len != -1) {
            System.out.println(new String(buf, 0, len));
            len = reader.read(buf);
        }
        reader.close();
    }

    //方式三：(重点掌握)
    public static void fangfa3() throws IOException {
        File file = new File("D:\\IO\\f.txt");
        FileReader reader = new FileReader(file);

        char[] buf = new char[64];
        int len = -1;
        while ((len = reader.read(buf)) != -1) {
            System.out.println(new String(buf, 0, len));
        }
        reader.close();
    }

}
