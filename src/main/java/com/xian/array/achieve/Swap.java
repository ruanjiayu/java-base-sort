package com.xian.array.achieve;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2019/8/15  10:36
 * @Version: 0.0.1-SHAPSHOT
 */
public class Swap {
    /**
     * 交换数组内的值
     * @param a
     * @param b
     * @param array
     */
    public static void swap(int a, int b, int[] array) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
