package com.zhangyong.jihe.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author 张勇
 * @Date 2019/10/18 17:20
 * @Version 1.0
 */
public class ArrayListDemo {
    //产生不重复的【10,20）之间的10个随机数
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        Random random = new Random();
        while (data.size() < 10) {
            int digit = random.nextInt(10) + 10; //随机参数大于等于10小于20的数
            if (!data.contains(digit)) {
                data.add(digit);
            }
        }
        data.forEach(item -> System.out.print(item + " "));
    }
}
