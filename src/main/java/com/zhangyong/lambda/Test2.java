package com.zhangyong.lambda;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @Author 张勇
 * @Date 2019/10/24 21:17
 * @Version 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        //匿名内部类
        Comparator<String> comparator1 = new Comparator<String>(){

            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        };
        int res1 = comparator1.compare("zhangsan", "lisi");
        System.out.println(res1);
        //Lambda表达式1
        Comparator<String> comparator2 = (String o1,String o2)->{
            return o1.length()-o2.length();
        };
        int res2 = comparator2.compare("zhangsan", "lishi");
        System.out.println(res2);
        //Lambda表达式2(Lambda表达式参数列表的数据类型可以省略。)

        Comparator<String> comparator3=(o1,o2)->{
            return o1.length()-o2.length();
        };
        int res3 = comparator3.compare("zahngsan", "lii");
        System.out.println(res3);

        //Lambda表达式3(如果Lambda的方法体只有一条语句，一对大括号和它后面的分号以及return关键字可以省略)
        //匿名内部类
        Function fun = new Function<Integer, Integer>(){

            @Override
            public Integer apply(Integer e) {
                return 10 +e;
            }
        };
        Object res4 = fun.apply(20);
        System.out.println(res4);

        Function<Integer,Integer> fun2=(item)->10+item;
        Integer res5 = fun2.apply(20);
        System.out.println(res5);

        //如果参数列表只有一形参，小括号也可以省略。
        Consumer<String> consumer = (item)-> System.out.println(item);
        consumer.accept("zhangsan");
    }
}
