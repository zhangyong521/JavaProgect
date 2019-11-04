package com.zhangyong.json.time;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Date;

/**
 * @Author 张勇
 * @Date 2019/10/19 15:19
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Stu stu = new Stu(1001,new Stu.Name("zhang","san"),null);

        String json = gson.toJson(stu); // Gson默认情况下不会导出值为null的键
        System.out.println(json);

        stu = new Stu(1001, new Stu.Name("zhang", "san"), new Date());
        String json1 = gson.toJson(stu); //内部类会序列化，日期格式默认
        System.out.println(json1);

        stu = new Stu(1001, null, new Date());
        Gson gson2 = new GsonBuilder()
                .serializeNulls() //序列化null
                .setDateFormat("yyyy-MM-dd") //设置日期时间格式，在序列化和反序列化时均生效
                .generateNonExecutableJson()//生成不可执行的json，在最前面加上）]}'
                .disableHtmlEscaping() //禁止转义HTML标签
                .setPrettyPrinting() //格式化输出
                .create();
        String json3 = gson.toJson(stu);
        System.out.println(json3);

    }
}
