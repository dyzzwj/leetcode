package com.dyzwj.sort;

import java.util.Random;

/**
 *   冒泡排序：把数组分成已排序和未排序两部分
 *   左边是未排序部分，右边是已排序部分
 *   关注 左边未排序部分最后一个元素的正确性
 *
 *   从小到大
 *
 */
public class 冒泡排序 extends Sort{


    public static void main(String[] args) {

        int[] arr = initArr(1);
        printArr(arr);
        sort(arr);
        System.out.println();
        printArr(arr);

    }

    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }

        }

    }



}
