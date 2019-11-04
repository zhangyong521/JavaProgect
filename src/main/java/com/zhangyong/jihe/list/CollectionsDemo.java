package com.zhangyong.jihe.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author 张勇
 * @Date 2019/10/18 17:43
 * @Version 1.0
 * 集合工具类
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wanger");
        list.add("mazi");

        System.out.println("--------打乱顺序为随机，每次都不一样------------");
        Collections.shuffle(list); //打乱顺序为随机，每次都不一样
        System.out.println(list);

        System.out.println("--------默认按照字典顺序排序-----------");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("---------按照字典顺序排序-----------");
        Collections.sort(list,String::compareTo);
        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"aa","ee","ff","11","33","aa");
        System.out.println("--------查询list1的数据---------");
        System.out.println(list1);

        //二分法查找，要求带查询的集合是有序的，返回值为待查询元素在有序列表中的位置
        System.out.println("--------查询的数据(按照字典顺序排序)---------");
        Collections.sort(list1,String::compareTo);
        System.out.println(list1);
        System.out.println("---------查询数据中的11的位置（默认先排序后查询位置）-----------");
        int i = Collections.binarySearch(list1, "11");
        System.out.println(i);

        System.out.println("--------查询数据中的最大值和最小值（ASKMZ）------------");
        String max = Collections.max(list1);
        String min = Collections.min(list1);
        System.out.println(max + " " + min);

        System.out.println("---------数据中的颠倒过来------------");
        Collections.reverse(list1);
        System.out.println(list1);

        System.out.println("----------替换数据中的值--------------");
        Collections.replaceAll(list1,"aa","**");
        System.out.println(list1);
    }

}
