package com.zhangyong.shuzu;


/**
 * @Author 张勇
 * @Date 2019/10/19 11:06
 * @Version 1.0
 */
public class MaoPao {
    public static void main(String[] args) {
        int[] array = new int[]{78, 76, 54, 67, 24, 13, 45};//待排序的int数组
        System.out.println("排序前的遍历结果是：");
        for (int temp : array) {
            System.out.print(temp + " ");
        }
        System.out.println();
        sort(array);
        System.out.println("排序后的遍历结果是：");
        for (int temp1 : array) { //排序后，数组发生的变化
            System.out.print(temp1 + " ");
        }
    }
    private static void sort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) { //冒泡排序的只要逻辑
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) { //交换两个数的位置
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

}
