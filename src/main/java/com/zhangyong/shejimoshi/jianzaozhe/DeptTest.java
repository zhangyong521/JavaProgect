package com.zhangyong.shejimoshi.jianzaozhe;

/**
 * @Author 张勇
 * @Date 2019/10/18 21:23
 * @Version 1.0
 */
public class DeptTest {
    public static void main(String[] args) {
        Dept dept = new Dept.DeptBuilder()
                .deptno(20)
                .dname("RESEARCH")
                .loc("DALLAS")
                .build();
        System.out.println(dept);
    }
}
