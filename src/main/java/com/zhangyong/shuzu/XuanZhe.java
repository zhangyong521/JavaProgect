package com.zhangyong.shuzu;

import java.util.Arrays;

/**
 * @Author 张勇
 * @Date 2019/10/19 12:51
 * @Version 1.0
 */
public class XuanZhe {
    public static void main(String[] args) {
        int[] array={78,99,32,87,98,76};
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void sort(int[] a) {
        int temp;
        int min = 0; //表示值最小的元素的下标
        for (int i = 0; i < a.length - 1; i++) { //比较多伦
            min = i; //在正式比较之前，设置当前最小元素的下标是已有序元素的下一个
            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j]) {
                    min = j;  //找出数组中（已排序元素除外）最小的元素的下标
                }
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
    }
}
