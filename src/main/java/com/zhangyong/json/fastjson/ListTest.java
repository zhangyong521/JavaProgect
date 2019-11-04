package com.zhangyong.json.fastjson;

import com.alibaba.fastjson.JSON;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author 张勇
 * @Date 2019/10/19 15:39
 * @Version 1.0
 */
public class ListTest {
    public static void main(String[] args) {
        Set<Object> depts = new HashSet<>();

        depts.add(new Dept(10, "ACCOUNTING", "NEWYORK"));
        depts.add(new Dept(20, "RESEARCH", "DALLAS"));
        depts.add(new Dept(30, "SALES", "CHICAGO"));
        depts.add(new Dept(40, "OPERATIONS", "BOSTON"));

        //序列化
        String json = JSON.toJSONString(depts);
        System.out.println(json);

        //反序列化
        List<Dept> res = JSON.parseArray(json, Dept.class);
        res.forEach(System.out::println);
    }
}
