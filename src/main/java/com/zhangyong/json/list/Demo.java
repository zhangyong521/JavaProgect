package com.zhangyong.json.list;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author 张勇
 * @Date 2019/10/19 13:31
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Gson gson = new Gson();
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"zhangsan","lisi","wanger","mazi");

        //序列化
        String json = gson.toJson(list);
        System.out.println(json);

        //反序列化
        Type type = new TypeToken<List<String>>() {
        }.getType();
        List<String> res = gson.fromJson(json, type);

        res.forEach(System.out::println);
    }
}
