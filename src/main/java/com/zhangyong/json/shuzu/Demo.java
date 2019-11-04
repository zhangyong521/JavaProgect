package com.zhangyong.json.shuzu;

import com.google.gson.Gson;

/**
 * @Author 张勇
 * @Date 2019/10/19 13:21
 * @Version 1.0
 *
 * 简单Java对象的序列化和反序列化
 */
public class Demo {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Dept dept = new Dept(10, "RESEARCH", "NEWYOR");
        //序列化
        String json = gson.toJson(dept);
        System.out.println(json);
        //反序列化
        Dept dept1 = gson.fromJson(json, Dept.class);
        System.out.println(dept1);
    }
}
