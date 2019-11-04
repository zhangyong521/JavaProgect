package com.zhangyong.json.fastjson.zhujie;

import com.alibaba.fastjson.JSON;

import java.util.Date;

/**
 * @Author 张勇
 * @Date 2019/10/19 15:50
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Stu stu = new Stu(1111, "zhangsan", new Date(),99);
        String json = JSON.toJSONString(stu); //序列化
        System.out.println(json);

        String data = "{'id':1111,'StuName':'zhangsan','birth':'2019-09-09','score':88}";
        Stu res = JSON.parseObject(data, Stu.class);
        System.out.println(res);
    }
}
