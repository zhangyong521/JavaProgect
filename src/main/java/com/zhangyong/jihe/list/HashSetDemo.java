package com.zhangyong.jihe.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author 张勇
 * @Date 2019/10/18 17:27
 * @Version 1.0
 */
public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("mazi");
        set.add("11");
        set.add("zhangsan");
        set.add("55");
        set.add("lisi");
        set.add("22");
        set.add("wanger");
        set.add("zz");
        set.add("mazi");

        System.out.println("-----输出HashSet保存的数据，不可以重复，重复的覆盖--------");
        System.out.println(set.size());

        System.out.println("------默认输出---------");
        for (String s :set){
            System.out.print(s+" ");
        }

        System.out.println("\n------迭代器输出-------");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        System.out.println("\n------forEach输出-------");
        set.forEach(item->System.out.print(item+" "));

        System.out.println("\n------forEach简单输出-------");
        set.forEach(System.out::println);

    }
}
