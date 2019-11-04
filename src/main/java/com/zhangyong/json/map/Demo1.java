package com.zhangyong.json.map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @Author 张勇
 * @Date 2019/10/19 14:56
 * @Version 1.0
 */
public class Demo1 {
    public static void main(String[] args) {
        GsonBuilder builder = new GsonBuilder();
        builder.excludeFieldsWithoutExposeAnnotation();
        Gson gson = builder.create();

        Dept1 dept1 = new Dept1(10, "accounting", "NEWYORK");
        String json = gson.toJson(dept1, Dept1.class);
        System.out.println(json);

        String data="{'deptno':40,'dname':'OPERATIONS','loc':'BOSTON'}";
        Dept1 res = gson.fromJson(data, Dept1.class);
        System.out.println(res);
    }
}
