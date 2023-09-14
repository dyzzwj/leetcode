package com.dyzwj.array;


/**
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 */
public class 多数元素 {

    public static void main(String[] args) {

//        int[] arr = new int[]{2,2,1,1,1,2,2};
        int[] arr = new int[]{1,3,1};
        System.out.println(majorityElement(arr));
    }


    public static int majorityElement(int[] arr){
        int major = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if(major == arr[i]){
                count++;
            }else if(count == 0){
                major = arr[i];
                count = 1;
            }else {
                count--;
            }
        }
        return major;
    }
}
