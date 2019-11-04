package com.zhangyong.json.jackson;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 张勇
 * @Date 2019/10/19 16:07
 * @Version 1.0
 */
public class ListTest {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        List<Dept> depts = new ArrayList<>();
        depts.add(new Dept(10, "ACCOUNTING", "NEWYORK"));
        depts.add(new Dept(20, "RESEARCH", "DALLAS"));
        depts.add(new Dept(30, "SALES", "CHICAGO"));
        depts.add(new Dept(40, "OPERATIONS", "BOSTON"));

        //序列化
        String json = objectMapper.writeValueAsString(depts);
        System.out.println(json);

        //反序列化
        JavaType type = objectMapper.getTypeFactory()
                .constructParametricType(ArrayList.class,Dept.class);

        List<Dept> res = objectMapper.readValue(json, type);
        res.forEach(System.out::println);
    }
}
