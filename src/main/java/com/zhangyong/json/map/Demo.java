package com.zhangyong.json.map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author 张勇
 * @Date 2019/10/19 13:42
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Map<String,Dept> map = new HashMap<>();

        map.put("accounting",new Dept(10, "ACCOUNTING", "NEWYORK"));
        map.put("research",new Dept(20, "RESEARCH", "DALLAS"));
        map.put("sales",new Dept(30, "SALES", "CHICAGO"));
        map.put("operations",new Dept(40, "OPERATIONS", "BOSTON"));

        //序列化
        String json = gson.toJson(map);
        System.out.println(json);

        //反序列化
        Type type = new TypeToken<Map<String, Dept>>() {
        }.getType();
        Map<String,Dept> res = gson.fromJson(json, type);

        res.forEach((k,v)->System.out.println(k+":"+v));
    }
}
