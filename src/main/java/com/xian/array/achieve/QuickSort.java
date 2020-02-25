package com.xian.array.achieve;

import static com.xian.array.achieve.Swap.swap;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2019/8/15  10:39
 * @Version: 0.0.1-SHAPSHOT
 */
public class QuickSort {

    /**
     * 快速排序
     * 时间复杂度: nlog(2n)
     * 空间复杂度
     * 稳定性:  不稳定 如：[5,8,5,2,9]
     * @param arr 需要进行排序的数组
     * @param low 需要排序的起始位置,我们一般填写0
     * @param high 需要排序的的结束位置，一般我们填写arr.length -1
     * 我们以第一数为基数a，先从最右边开始找到小于a的数字，记录下坐标a1
     * 接着从左边开始，找到大于a的值，记录下坐标a2,a1和a2的值进行交换
     * 再接着从右边刚刚等停止的位置上开始找小于a的位子，记录...
     * 最后当两个指针相遇的时候，交换相遇的位置的坐标点与基数的数字，
     * 现在基数已经归位，我们需要做的事情就是讲基数左边和右边的数，进行快速排序
     */
    public static void quickSort(int[] arr,int low,int high){
        int i, j, temp;
        if (low >= high) {
            return;
        }
        i = low;
        j = high;
        //temp就是基准位
        temp = arr[low];
        while (i < j) {
            //先看右边，依次往左递减
            while (temp <= arr[j] && i < j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp >= arr[i] && i < j) {
                i++;
            }
            //如果满足条件则交换
            if (i < j) {
                swap(i, j, arr);
            }
        }
        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        //递归调用左半数组
        quickSort(arr, low, j-1);
        //递归调用右半数组
        quickSort(arr, j+1, high);
    }

}
