package com.zhangyong.scott;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 张勇
 * @Date 2019/10/18 10:09
 * @Version 1.0
 * Scott 数据 映射 MySQL Java
 */

public class Test {
    public static void main(String[] args) {
        List<Dept> depts = new ArrayList<>();
        depts.add(new Dept(10,"ACCOUNTING","NEWYORK"));
        depts.add(new Dept(20,"RESEARCH","DALLAS"));
        depts.add(new Dept(30,"SALES","CHICAGO"));
        depts.add(new Dept(40,"OPERATIONS","BOSTON"));

        List<Emp> emps=new ArrayList<>();
        emps.add(new Emp(7369,"SMITH","CLERK",7902,LocalDate.of(1980,12,17),800D,0D,20));
        emps.add(new Emp(7499,"ALLEN","SALESMAN",7698,LocalDate.of(1981,2,20),1600D,300D,30));
        emps.add(new Emp(7521,"WARD","SALESMAN",7698,LocalDate.of(1981,2,22),1250D,500D,30));
        emps.add(new Emp(7566,"JONES","MANAGER",7893,LocalDate.of(1981,4,2),2975D,0D,20));
        emps.add(new Emp(7654,"MARTIN","SALESMAN",7698,LocalDate.of(1981,9,28),1250D,1400D,30));
        emps.add(new Emp(7698,"BLAKE","MANAGER",7839,LocalDate.of(1981,5,1),2850D,0D,30));
        emps.add(new Emp(7782,"CLARK","MANAGER",7839,LocalDate.of(1981,6,9),2450D,0D,10));
        emps.add(new Emp(7788,"SCOTT","ANALYST",7566,LocalDate.of(1987,4,19),3000D,0D,20));
        emps.add(new Emp(7839,"KING","PRESIDENT",null,LocalDate.of(1981,11,17),5000D,0D,10));
        emps.add(new Emp(7844,"TURNER","SALESMAN",7698,LocalDate.of(1981,9,8),1500D,0D,30));
        emps.add(new Emp(7876,"ADAMS","CLERK",7788,LocalDate.of(1987,5,23),1100D,0D,20));
        emps.add(new Emp(7900,"JAMES","CLERK",7698,LocalDate.of(1981,12,3),950D,0D,30));
        emps.add(new Emp(7902,"FORD","ANALYST",7566,LocalDate.of(1981,12,3),3000D,0D,20));
        emps.add(new Emp(7934,"MILLER","CLERK",7782,LocalDate.of(1982,1,23),1300D,0D,10));
    }
}
