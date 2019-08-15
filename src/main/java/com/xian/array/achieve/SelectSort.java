package com.xian.array.achieve;

import static com.xian.array.achieve.Swap.swap;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2019/8/15  10:40
 * @Version: 0.0.1-SHAPSHOT
 */
public class SelectSort {

    /**
     * 选择排序：
     * 时间复杂度: O(n2)
     * 空间复杂度:
     * 稳定性： 不稳定 如：[5,8,5,2,9]
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
}
