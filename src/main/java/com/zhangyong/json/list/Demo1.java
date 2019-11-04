package com.zhangyong.json.list;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 张勇
 * @Date 2019/10/19 13:37
 * @Version 1.0
 */
public class Demo1 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        List<Dept> depts = new ArrayList<>();

        depts.add(new Dept(10, "ACCOUNTING", "NEWYORK"));
        depts.add(new Dept(20, "RESEARCH", "DALLAS"));
        depts.add(new Dept(30, "SALES", "CHICAGO"));
        depts.add(new Dept(40, "OPERATIONS", "BOSTON"));

        //序列化
        String json = gson.toJson(depts);
        System.out.println(json);

        //反序列化

        Type type = new TypeToken<List<Dept>>() {
        }.getType();
        List<Dept> res = gson.fromJson(json, type);
        res.forEach(System.out::println);

    }
}
