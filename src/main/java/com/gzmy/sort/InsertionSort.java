package com.gzmy.sort;

/**
 * @ClassName InsertionSort
 * @Description TODO
 * @Author Dravin
 * @Date 2019/12/17 1:32 PM
 * @Version 1.0
 */
public class InsertionSort extends Sort {
    @Override
    public void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            insert(arr,0,i,i+1);

        }

    }

    public void insert(int[] arr,int start_index,int end_index,int target_index){
        for (int i = end_index; i >=start_index ; i--) {
            if(arr[target_index]<arr[i]){
                swap(arr,i,target_index);
                target_index=i;
            }else{
                break;

            }

        }

    }
}
