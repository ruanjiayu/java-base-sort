package com.xian.array.achieve;

import java.util.Arrays;

/**
 * @Description: 堆排序 详细查看：https://blog.csdn.net/l577217/article/details/80516654
 * @Author: Xian
 * @CreateDate: 2019/8/15  10:44
 * @Version: 0.0.1-SHAPSHOT
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] array = new int[]{12, 5, 9 , 36, 8, 21, 7 , 1 , 11, 40, 48, 1};
        System.out.println("【第一次建立堆】");
        initHeap(array);
        System.out.println(Arrays.toString(array));

        heapSort(array);
        System.out.println("排序之后：");
        System.out.println(Arrays.toString(array));
    }


    public static void heapSort(int[] array){
        //建堆
        initHeap(array);

        int count = array.length;
        while(count > 1) {
            int tmp = array[count - 1];
            array[count - 1] = array[0];
            array[0] = tmp;

            count--; //未排序部分又少一个
            //调整过程自上而下，参数root=0
            adjustHeap(array, count, 0);
        }
    }

    public static void initHeap(int[] array){
        //建堆，从最后一个非叶子节点开始，而最后一个非叶子节点的下标为array.length/2-1
        for(int root = array.length/2 - 1; root >= 0; root--){
            adjustHeap(array, array.length, root);
        }

    }


    public static void adjustHeap(int[] array, int count, int root){
        int maxChildIndex;
        //待调整子堆的根节点必须是非叶子节点
        while(root <= count/2-1) {
            //需要在root、letfchild、rightchild中找到最大的值，
            //因为最后一个非叶子节点有可能没有右孩子，所以要做出判断。
            if(root == count/2 - 1 && count % 2 == 0){
                //节点数量为偶数时，最后一个非叶子节点只有左孩子
                maxChildIndex = 2 * root + 1;
            }else{
                int leftChildIndex = 2 * root + 1;
                int rightChildIndex = 2 * root + 2;

                maxChildIndex = array[leftChildIndex] > array[rightChildIndex] ?
                        leftChildIndex : rightChildIndex;
            }

            if(array[root] < array[maxChildIndex]){
                Swap.swap(root,maxChildIndex,array);
                //*****************这里很重要，继续调整因交换结构改变的子堆
                root = maxChildIndex;
            }else{
                return;
            }
        }
    }

}
