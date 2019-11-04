package com.zhangyong.jihe.set;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

/**
 * @Author 张勇
 * @Date 2019/10/18 21:04
 * @Version 1.0
 */
public class ReadDemo {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        Reader reader = new FileReader(new File("D:\\IO\\abcd.txt"));
        properties.load(reader);

        String url = properties.getProperty("url");
        System.out.println(url);
        String user2 = properties.getProperty("user2"); //文件里面没有默认为空
        System.out.println(user2);
        String password = properties.getProperty("password", "default");//文件里面没有设置为default
        System.out.println(password);
    }
}
