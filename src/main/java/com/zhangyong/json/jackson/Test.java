package com.zhangyong.json.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * @Author 张勇
 * @Date 2019/10/19 16:01
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Dept dept = new Dept(10, "ACCOUNTING", "NEWYORK");

        //序列化
        String json = objectMapper.writeValueAsString(dept);
        System.out.println(json);

        //反序列化
        Dept res = objectMapper.readValue(json, Dept.class);
        System.out.println(res);

    }
}
