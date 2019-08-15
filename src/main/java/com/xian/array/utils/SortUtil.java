package com.xian.array.utils;

import com.xian.array.achieve.*;

import java.util.Arrays;

/**
 * 时间复杂度: 算法使用的次数，注意下面的算法实现的都是最坏(平均)的复杂度。
 * 如果想要优化算法，也就是达到最优的时间复杂度，需要你设置标识位，来提前结束算法
 * 空间复杂度
 * 稳定性:通俗地讲就是能保证排序前2个相等的数其在序列的前后位置顺序和排序后它们两个的前后位置顺序相同
 * @Description
 * @Author ruanjiayu
 * @DateTime 2019/8/13 8:56
 */
public class SortUtil {

    /**
     * 冒泡排序
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        BubbleSort.bubbleSort(arr);
    }

    /**
     * 快速排序
     * @param arr 需要进行排序的数组
     * @param low 需要排序的起始位置,我们一般填写0
     * @param high 需要排序的的结束位置，一般我们填写arr.length -1
     */
    public static void quickSort(int[] arr,int low,int high){
        QuickSort.quickSort(arr, low, high);
    }


    /**
     * 选择排序：
     * @param array
     */
    public static void selectSort(int[] array) {
        SelectSort.selectSort(array);
    }

    /**
     * 插入排序
     * @param array
     */
    public static void insertSort(int[] array){
        InsertSort.insertSort(array);
    }

    /**
     * 希尔排序
     * @param arr
     */
    public static void shellSort(int[] arr){
        ShellSort.shellSort(arr);
    }

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

    public static void main(String[] args) {
        System.out.println("-----------冒泡排序-----------");
        int[] bubbleArr = {2,3,5,1,23,6,78,34};
        bubbleSort(bubbleArr);
        System.out.println(Arrays.toString(bubbleArr));
        System.out.println();
        System.out.println("-----------快速排序-----------");
        int[] quickArr = {2,3,5,1,23,6,78,34};
        quickSort(quickArr, 0, quickArr.length -1 );
        System.out.println(Arrays.toString(quickArr));
        System.out.println();
        System.out.println("-----------选择排序-----------");
        int[] selectArr = {2,3,5,1,23,6,78,34};
        selectSort(selectArr);
        System.out.println(Arrays.toString(selectArr));
        System.out.println();
        System.out.println("---------插入排序-------------");
        int[] insertArr = {2,3,5,1,23,6,78,34};
        insertSort(insertArr);
        System.out.println(Arrays.toString(insertArr));
        System.out.println();
        System.out.println("-------shell排序");
        int[] shellArr = {2,3,5,1,23,6,78,34};
        shellSort(shellArr);
        System.out.println(Arrays.toString(shellArr));
    }
}

