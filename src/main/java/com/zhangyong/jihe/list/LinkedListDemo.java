package com.zhangyong.jihe.list;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author 张勇
 * @Date 2019/10/18 16:27
 * @Version 1.0
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        //当父类变量指向子类对象时，父类变量只能调用他自己声明的方法，不能调用子类特有的方法

        list.add("aa");
        list.add("cc");
        list.add("bb");
        System.out.println("-----输出list的值-------------");
        System.out.println(list);

        //list.addFirst("dhjsdh")  //这是LinkeList子类的方法，父类对象不能使用

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("11");
        list1.add("22");
        list1.add(1, "33");  //在1的位置插入
        System.out.println("--------输出list1里面的数------------");
        System.out.println(list1);

        System.out.println("-----在数据的首末插入数字--------");
        list1.addFirst("88");  //在数据的首加入
        list1.addLast("00");   //在数据的末加入
        System.out.println(list1);

        System.out.println("------把list里面的数据全部装入list中------");
        list1.addAll(list);//把list里面的数据全部装入list中
        System.out.println(list);


        //LinkedList排序
        System.out.println("-------LinkedList排序----------");
        List<String> list2 = new LinkedList<>();
        list2.add("zhangsan");
        list2.add("lisi");
        list2.add("wanger");
        list2.add("mazi");

        System.out.println("---按照名称的降序排序----------");
        list2.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        });
        System.out.println(list2);

        System.out.println("---按照名称的升序排序----------");
        list2.sort((o1,o2)->o1.compareTo(o2));
        System.out.println(list2);

        list2.sort(String::compareTo);
        list2.forEach(System.out::println);
    }

}
