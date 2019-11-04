package com.zhangyong.jihe.set;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author 张勇
 * @Date 2019/10/18 20:53
 * @Version 1.0
 */
public class WriterDemo {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        Writer writer = new FileWriter(new File("D:\\IO\\abcd.txt"));
        properties.setProperty("url","com.mysql.cj.jdbc.Driver");
        properties.setProperty("user","rooot");
        properties.setProperty("psdjd","root");
        properties.store(writer,"haha");
        writer.close();
    }
}
