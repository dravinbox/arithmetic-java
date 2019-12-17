package com.gzmy.sort;

/**
 * @ClassName BubbleSort
 * @Description TODO
 * @Author Dravin
 * @Date 2019/12/17 1:25 PM
 * @Version 1.0
 */
public class BubbleSort extends Sort {
    @Override
    public void sort(int[] arr){
        for (int i = arr.length-1; i >=0 ; i--) {
            bubble(arr,0,i);


        }

    }

    public void bubble(int[] arr,int start_index,int end_index){
        for (int i = start_index; i < end_index; i++) {
            if(arr[i]>arr[i+1]){
                swap(arr,i,i+1);
            }

        }


    }
}
