package com.zhangyong.io.kaobei;

import javax.xml.transform.Source;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author 张勇
 * @Date 2019/10/18 13:46
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        //wenjian();
        yinping();
    }
    public static void wenjian() throws IOException{
        File file1 = new File("D:\\IO\\f.txt");
        File file2 = new File("D:\\IO\\a.txt");

        FileReader reder = new FileReader(file1);
        FileWriter writer = new FileWriter(file2);

        int len=-1;
        char[] buf = new char[128];
        while ((len=reder.read(buf))!=-1){
            writer.write(new String(buf,0,len));
        }
        writer.flush();
        writer.close();
        reder.close();
    }

    public static void yinping() throws IOException{
        File source = new File("D:\\IO\\01.课程计划.avi");
        File aim = new File("D:\\IO\\01.课程计划2.avi");

        FileInputStream fis = new FileInputStream(source);
        FileOutputStream fos = new FileOutputStream(aim);


        byte[] buf = new byte[256];
        int len=-1;
        while ((len=fis.read(buf))!=-1){
            fos.write(buf,0,len);
        }
        fos.flush();
        fos.close();
        fis.close();
    }

}
