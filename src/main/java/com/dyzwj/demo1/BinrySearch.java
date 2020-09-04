package com.dyzwj.demo1;

/**
 * 二分查找
 */
public class BinrySearch {

    public static void main(String[] args) {


    }


    public int binrySearch(int[] arr,int target){
        int begin = 0;
        int end = arr.length - 1;
        int mid;

        while (end >= begin){
            mid = (begin + end) / 2;
            if(target > arr[mid]){
                begin = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else {
                return mid;
            }

        }
        return -1;
    }

}
