package com.dyzwj.sort;


/**
 * 把数组分为已排序和未排序
 * 左边是已排序 右边是未排序
 * 关注 把右边未排序的第一个元素放在左边已排序的正确位置
 */
public class 插入排序 extends Sort{


    public static void main(String[] args) {

        int[] arr = initArr(10);
        printArr(arr);
        sort(arr);
        System.out.println();
        printArr(arr);

    }


    public static void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+  1; j > 0 ; j--) {
                if(arr[j] < arr[j-1]){
                    int temp  = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

    }
}
