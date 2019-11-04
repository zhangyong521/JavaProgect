package com.zhangyong.jedis;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @Author 张勇
 * @Date 2019/10/28 14:31
 * @Version 1.0
 */
class JedisUtilTest {
    @Test
    public void mapHset() {
        long res = JedisUtil.mapHset("map", "name", "zhangsan");
        System.out.println(res);
    }

    @Test
    public void mapHget() {
        String res = JedisUtil.mapHget("map", "name");
        System.out.println(res);
    }

    @Test
    public void mapHmset() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "zhangsan");
        map.put("age", "13");
        map.put("birth", "1999-09-09");
        String res = JedisUtil.mapHmset("map", map);
        System.out.println(res);
    }

    @Test
    public void mapHmget() {
        List<String> res = JedisUtil.mapHmget("map", "name", "age", "birth");
        System.out.println(res);
    }

    @Test
    public void del() {
        long list = JedisUtil.del("add");
        System.out.println(list);
    }

    @Test
    public void listLrange() {
        List<String> list = JedisUtil.listLrange("list", 0, -1);
        System.out.println(list);
    }

    @Test
    public void listRPush() {
        long res = JedisUtil.listRPush("list", "aa", "bb", "cc", "bb");
        System.out.println(res);
    }

    @Test
    public void strSet() {
        String res = JedisUtil.strSet("k2", "v2", 60);
        System.out.println(res);
    }

    @Test
    public void strSet1() {
        String res = JedisUtil.strSet("k3", "v3");
        System.out.println(res);
    }

    @Test
    public void strGet() {
        String k2 = JedisUtil.strGet("k2");
        System.out.println(k2);
    }
}