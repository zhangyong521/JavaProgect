package com.zhangyong.jihe.gongsi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author 张勇
 * @Date 2019/10/18 18:34
 * @Version 1.0
 */
public class TestDemo1 {
    public static void main(String[] args) {
        List<Dept> depts = new ArrayList<>();
        depts.add(new Dept(10,"ACCOUNTING","NEWYORK"));
        depts.add(new Dept(40,"OPERATIONS","BOSTON"));
        depts.add(new Dept(20,"SALES","DALLAS"));
        depts.add(new Dept(30,"RESEARCH","CHICAGO"));

        System.out.println("-------按照dname降序排序--------");
        Collections.sort(depts);  //此处Dept类必须实现comparable接口
        for (Dept dept:depts){
            System.out.println(dept);
        }
    }
}
