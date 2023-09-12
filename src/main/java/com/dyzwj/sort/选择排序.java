package com.dyzwj.sort;


/**
 * 把数组分成已排序和未排序两部分
 * 左边是已排序 右边是未排序
 *
 * 关注： 未排序部分第一个元素的正确性
 *
 */
public class 选择排序 extends Sort{


    public static void main(String[] args) {
        int[] arr = initArr(2);
        printArr(arr);
        sort(arr);
        System.out.println();
        printArr(arr);
    }

    public static void sort(int[] arr){
        if(arr.length < 2){
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length ; j ++){
                if(arr[index] > arr[j]){
                    index = j;}
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }

    }

}

