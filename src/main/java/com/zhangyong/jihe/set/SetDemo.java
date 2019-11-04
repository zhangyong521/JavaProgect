package com.zhangyong.jihe.set;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author 张勇
 * @Date 2019/10/18 19:27
 * @Version 1.0
 */
public class  SetDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("zhangsan",88);
        map.put("lisi",86);
        map.put("wanger",92);
        map.put("mazi",63);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String,Integer> entry:entries){
            System.out.println(entry.getKey()+"■"+entry.getValue());
        }

        Set<String> keys = map.keySet();
        for (String key :keys){
            Integer value = map.get(key);
            System.out.println(key+" "+value);
        }
        map.forEach((k,v)->System.out.println(k+"●"+v));
    }
}
