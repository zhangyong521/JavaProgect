package com.zhangyong.json.jackson.zhujie;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Date;

/**
 * @Author 张勇
 * @Date 2019/10/19 16:35
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Stu.Addr addr = new Stu.Addr("guizhou","anshun");
        Stu stu = new Stu(111,"zhangsan",new Date(),88.9f,addr);
        String json = objectMapper.writeValueAsString(stu);
        System.out.println(json);
    }
}
