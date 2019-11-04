package com.zhangyong.json.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

import java.util.HashMap;
import java.util.Map;
import java.util.TooManyListenersException;

/**
 * @Author 张勇
 * @Date 2019/10/19 15:43
 * @Version 1.0
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, Dept> map = new HashMap<>();
        map.put("accounting",new Dept(10, "ACCOUNTING", "NEWYORK"));
        map.put("research",new Dept(20, "RESEARCH", "DALLAS"));
        map.put("sales",new Dept(30, "SALES", "CHICAGO"));
        map.put("operations",new Dept(40, "OPERATIONS", "BOSTON"));

        //序列化
        String json = JSON.toJSONString(map);
        System.out.println(json);

        //反序列化
        Map<String,Dept> res = JSONObject.parseObject(json,new TypeReference<Map<String,Dept>>(){});
        res.forEach((k,v)->System.out.println(k+" "+v));
    }
}
