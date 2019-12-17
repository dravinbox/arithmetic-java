package com.gzmy;

import com.gzmy.sort.SelectSort;

/**
 * @ClassName Main
 * @Description TODO
 * @Author Dravin
 * @Date 2019/12/17 9:02 AM
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("hello,world");
        int[] arr = new int[]{3,1,4,2,5};
        SelectSort selectSort = new SelectSort();
        selectSort.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }
    }
}
