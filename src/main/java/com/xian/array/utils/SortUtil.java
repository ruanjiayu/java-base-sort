package com.xian.array.utils;

import java.util.Arrays;

/**
 * @Description
 * @Author ruanjiayu
 * @DateTime 2019/8/13 8:56
 */
public class SortUtil {

    /**
     * 冒泡排序
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

    /**
     * 快速排序
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
        if (low > high) {
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


    /**
     * 选择排序：
     *  第一轮循环:假设第一个数a为最小值，比较后面的值的大小
     *  记录下比第一个数小的坐标(数为b)，后面比较的是b与后面值得大小
     *  如果出现了比b小的数c，那么记录坐标，并且将c与后面的数比较大小
     *  运行到最后，可以将第一个数与记录下的最小那个数进行交换
     *  第二轮循环:假设第二个数为最小值，....
     * @param array
     */
    public static void selectSort(int[] array) {
        for(int i = 0; i < array.length; ++i) {
            int index = i;
            for(int j = i +1; j < array.length; ++j){
                if(array[j] < array[index]){
                    index = j;
                }
            }
            if(i != index) {
                swap(i, index, array);
            }
        }

    }

    /**
     * 插入排序
     * a b c 表示所处的位置
     * 第一步:比较前面两个的数字a和b的大小，将小的放置在前面
     * 第二步：比较c与b的大小，小的话进行交换，并且再次比较a的大小，
     * 如果大于b,那么就不需要去b比较a的位子
     * 第三步: 比较d:....
     * @param array
     */
    public static void insertSort(int[] array){
        for(int i = 1; i < array.length; ++i){
            for(int j = i; j > 0; j--){
                if(array[j] < array[j - 1]){
                    swap(j, j - 1, array);
                }else{
                    break;
                }
            }
        }
    }

    /**
     * 希尔排序
     *
     * @param arr
     */
    public static void shellSort(int[] arr){
        // d 表示增量7 3 1
        for(int d = arr.length / 2; d > 0; d /= 2) {
            for(int i = d; i < arr.length; ++i) {
                for(int j = i - d ; j >= 0; j -= d) {
                    if(arr[j] > arr [j + d]) {
                        swap(j, j +d , arr);
                    }
                }
            }
        }
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
        selectSort(bubbleArr);
        Arrays.toString(bubbleArr);
        System.out.println();
        System.out.println("-----------快速排序-----------");
        int[] quickArr = {2,3,5,1,23,6,78,34};
        quickSort(quickArr, 0, quickArr.length -1 );
        Arrays.toString(quickArr);
        System.out.println();
        System.out.println("-----------选择排序-----------");
        int[] selectArr = {2,3,5,1,23,6,78,34};
        selectSort(selectArr);
        Arrays.toString(selectArr);
        System.out.println();
        System.out.println("---------插入排序-------------");
        int[] insertArr = {2,3,5,1,23,6,78,34};
        insertSort(insertArr);
        Arrays.toString(insertArr);
        System.out.println();
        System.out.println("-------shell排序");
        int[] shellArr = {2,3,5,1,23,6,78,34};
        shellSort(shellArr);
        Arrays.toString(shellArr);
    }
}

