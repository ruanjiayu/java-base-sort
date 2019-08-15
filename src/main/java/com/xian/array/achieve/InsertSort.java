package com.xian.array.achieve;

import static com.xian.array.achieve.Swap.swap;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2019/8/15  10:40
 * @Version: 0.0.1-SHAPSHOT
 */
public class InsertSort {

    /**
     * 插入排序
     * 时间复杂度:O(n2)
     * 空间复杂度:
     * 稳定性： 稳定
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
}
