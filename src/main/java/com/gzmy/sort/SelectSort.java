package com.gzmy.sort;

/**
 * @ClassName SelectSort
 * @Description 选择排序
 * @Author Dravin
 * @Date 2019/12/17 9:03 AM
 * @Version 1.0
 */
public class SelectSort extends Sort{


    /**
     * 描述: 求最小值的下标
     *
     * @author Dravin
     * @date 9:09 AM 2019/12/17
     * @param [arr, start_index, end_index]
     * @return int
     **/
    public int minIndex(int[] arr,int start_index,int end_index){
        int min_index = start_index;
        for (int i = start_index; i <= end_index; i++) {
            if(arr[i]<arr[min_index]){
                min_index = i;
            }
        }
        return min_index;

    }

    /**
     * 描述: 执行排序
     *
     * @author Dravin
     * @date 9:11 AM 2019/12/17
     * @param [arr]
     * @return void
     **/
    @Override
    public void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int one_min_index = minIndex(arr,i,arr.length-1);
            if(one_min_index!=i){
                swap(arr,i,one_min_index);
            }

        }

    }
}
