package com.zhangyong.json.fastjson;

import com.alibaba.fastjson.JSON;

/**
 * @Author 张勇
 * @Date 2019/10/19 15:35
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Dept dept = new Dept(10, "RESEARCH", "NEWYORK");
        //序列化
        String json = JSON.toJSONString(dept);
        System.out.println(json);

        //反序列化
        Dept res = JSON.parseObject(json, Dept.class);
        System.out.println(res.getDname());
    }
}
