package com.zhangyong.json.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author 张勇
 * @Date 2019/10/19 16:16
 * @Version 1.0
 */
public class MapTest {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        Map<String,Dept> map = new HashMap<>();

        map.put("accounting",new Dept(10, "ACCOUNTING", "NEWYORK"));
        map.put("research",new Dept(20, "RESEARCH", "DALLAS"));
        map.put("sales",new Dept(30, "SALES", "CHICAGO"));
        map.put("operations",new Dept(40, "OPERATIONS", "BOSTON"));

        //序列化
        String json = objectMapper.writeValueAsString(map);
        System.out.println(json);

        //反序列化
        JavaType type = objectMapper.getTypeFactory()
                .constructParametricType(HashMap.class, String.class, Dept.class);

        Map<String,Dept> res = objectMapper.readValue(json, type);
        res.forEach((k,v)->System.out.println(k+""+v));
    }
}
