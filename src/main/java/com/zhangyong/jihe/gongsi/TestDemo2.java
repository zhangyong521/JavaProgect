package com.zhangyong.jihe.gongsi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author 张勇
 * @Date 2019/10/18 19:17
 * @Version 1.0
 */
public class TestDemo2 {
    public static void main(String[] args) {
        List<Dept> depts = new ArrayList<>();
        depts.add(new Dept(10,"ACCOUNTING","NEWYORK"));
        depts.add(new Dept(40,"OPERATIONS","BOSTON"));
        depts.add(new Dept(20,"SALES","DALLAS"));
        depts.add(new Dept(30,"RESEARCH","CHICAGO"));

        System.out.println("---------降序---------");
        depts.sort((o1,o2)->o1.getDname().compareTo(o2.getDname()));
        depts.forEach(System.out::println);
        System.out.println("--------升序----------");
        Collections.sort(depts,(o1,o2)->o2.getDname().compareTo(o1.getDname()));
        depts.forEach(System.out::println);
    }
}
