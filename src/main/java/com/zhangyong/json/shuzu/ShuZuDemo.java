package com.zhangyong.json.shuzu;

import com.google.gson.Gson;

/**
 * @Author 张勇
 * @Date 2019/10/19 13:26
 * @Version 1.0
 */
public class ShuZuDemo {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String[] array={"zhangyong","lisi","wanger","mazi"};

        //序列化
        String json = gson.toJson(array);
        System.out.println(json);

        //反序列化
        String[] res = gson.fromJson(json, String[].class);
        for (String item : res) {
            System.out.println(item);
        }
    }
}
