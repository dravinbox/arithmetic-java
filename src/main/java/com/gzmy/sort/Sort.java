package com.gzmy.sort;

/**
 * @ClassName Sort
 * @Description TODO
 * @Author Dravin
 * @Date 2019/12/17 1:22 PM
 * @Version 1.0
 */
public class Sort implements ISort{

    /**
     * 描述: 交换元素
     *
     * @author Dravin
     * @date 9:05 AM 2019/12/17
     * @param [arr, target_index, replace_index]
     * @return void
     **/
    public void swap(int[] arr,int target_index,int replace_index){
        int tmp = arr[target_index];
        arr[target_index] = arr[replace_index];
        arr[replace_index] = tmp;
    }

    public void sort(int[] arr) {}
}
