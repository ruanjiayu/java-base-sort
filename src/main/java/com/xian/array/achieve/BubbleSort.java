package com.xian.array.achieve;

import static com.xian.array.achieve.Swap.swap;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2019/8/15  10:37
 * @Version: 0.0.1-SHAPSHOT
 */
public class BubbleSort {
    /**
     * 冒泡排序
     * 时间复杂度 O(n2)
     * 空间复杂度
     * 稳定性:  稳定
     * a b c d表示数组的位子上的数字，会发现变换
     * 第一轮:
     * 比较a和b,如果a大于b，那么交换a,b位子上的数字，接着比较b和c
     * 如果c大于b,那么不进行交换，接着比较c和d
     * 如果c的数字小于b,那么交换b和c位子上的数字，接着比较c和d
     * 第二轮:
     * 比较b和c ...
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            for (int j = 0; j < arr.length -1 -i; ++i) {
                if (arr[j + 1] < arr[j]){
                    swap(j, j +1, arr);
                }
            }
        }
    }
}
