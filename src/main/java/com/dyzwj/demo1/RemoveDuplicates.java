package com.dyzwj.demo1;

import sun.jvm.hotspot.debugger.posix.elf.ELFException;

import java.util.Arrays;

/**
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 *
 * 1、给定数组 nums = [1,1,2],
 *
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 *
 * 2、给定 nums = [0,0,1,1,1,2,2,3,3,4],
 *
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 *
 *
 */
public class RemoveDuplicates {


    public static void main(String[] args) {
        System.out.println(test1(new int[]{0,0,1,1,1,2,2,3,3,4}));
//        System.out.println(removeDuplicates(new int[]{1,2,3,4}));


        //[0,0,1,1,1,2,2,3,3,4]
    }

    public static int removeDuplicates(int[] nums) {

        int j = 1,i=0;
        for ( ; j < nums.length ; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        System.out.println(Arrays.toString(nums));
        return i + 1;

    }

    public static int removeDuplicates1(int[] nums) {

        int res = 1;
        int a = 0;

        for(int i = 0; i < nums.length - 1;){

            if (nums[i] == nums[i+1]) {

                while (i < nums.length - 1 && nums[i]== nums[i+1]){

                    i++;
                    continue;
                }
                if(i < nums.length - 1)
                    nums[res++] = nums[i + 1];

            }else {
                a++;
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));
        return res + a;


    }



    public static int test1(int[] arr){
        int index = 0;
        for (int i = 1; i < arr.length; i++){
            if(arr[i] != arr[index]){
                index++;
                arr[index] = arr[i];
            }

        }
        System.out.println(Arrays.toString(arr));
        return index + 1;

    }




}
