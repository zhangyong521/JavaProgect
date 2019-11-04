package com.zhangyong.shuzu;

/**
 * @Author 张勇
 * @Date 2019/10/19 13:08
 * @Version 1.0
 */
public class ErFenFa {
    public static void main(String[] args) {
        int[] array={1,3,4,5,17,18,31,33};
        int binarySearch = binarySearch(array, 17);
        System.out.println(binarySearch);
    }

    public static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (key == array[mid]) {
                return mid;
            } else if (key < array[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
