package com.zhangyong.jihe.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author 张勇
 * @Date 2019/10/18 16:12
 * @Version 1.0
 */
public class ListDemo {
    public static void main(String[] args) {
        //面向接口编程
        //接口变量指向实现类的对象
        //将实现类的对象赋值给接口类型的变量
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("cc");
        list.add("bb");
        list.add("aa");
        //输出list的个数
        System.out.println("------------输出list的个数-----------");
        System.out.println(list.size());

        //遍历每一个集合中的数(普通遍历)
        System.out.println("---------遍历每一个集合中的数(普通遍历)----------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //简单遍历
        System.out.println("-----------简单遍历--------------");
        for (String s : list) {
            System.out.println(s);
        }

        //利用迭代器
        System.out.println("-----------利用迭代器--------------");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //利用list独有的迭代方式查询
        System.out.println("-----------利用list独有的迭代方式查询--------------");
        ListIterator<String> iterator1 = list.listIterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        System.out.println("-----------利用forEach输出--------------");
        list.forEach(System.out::println);
    }
}
