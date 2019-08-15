package com.xian.array.achieve;

import static com.xian.array.achieve.Swap.swap;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2019/8/15  10:35
 * @Version: 0.0.1-SHAPSHOT
 */
public class ShellSort {

    /**
     * 希尔排序
     * 时间复杂度: O(n1.3)
     * 空间复杂度:
     * 稳定性： 不稳定 如[5,5,3,3]
     * 假设我们的数组为[6,4,2,7,3,1,8,5,9]
     * 首先将取得增量，增量的来源是数组长度除以2,得到的增量表示4， 2 ， 1
     * 那么一开始比较的是6/3， 4/1， 2/8， 7/5, 6/9，得到的数组是【3, 1, 2, 5, 6, 4, 8, 7, 9】
     * 接着比较的是3/2， 1/5， 2,/6， 5/4, 6/8， 5/7， 8/9 得到的数组为【2, 1 , 3, 4 , 6, 5, 8 , 7 , 9】
     * 最后就是两两的相互比较。
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

}
