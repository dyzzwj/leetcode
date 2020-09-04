package com.dyzwj.demo1;




import java.util.*;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]

 */
public class TwoSum {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 3, 5, 2, 7, 10, 6};
        int target = 10;
        System.out.println(Arrays.toString(twoSumWithHash(arr,target)));
//        System.out.println(Arrays.toString(twoSum1(arr,target)));
    }



    /**
     * 使用头尾指针解决
     *
     */
    public static int[] twoSum1(int[] nums, int target) {
        /**
         * 排序
         */
        Arrays.sort(nums);
        /**
         * 头指针
         */
        int i = 0;
        /**
         * 尾指针
         */
        int j = nums.length - 1;
        while (j > i){
            if(nums[j] + nums[i] == target){
                return new int[]{nums[i],nums[j]};
            }else if(nums[i] + nums[j] > target){
                //尾指针向前移
                j--;
            }else {
                //头指针向后移
                i++;
            }
        }
        return null;
    }



        /**
         * 使用HashMap解决
         * @param nums
         * @param target
         * @return
         */
    public static int[] twoSumWithHash(int[] nums, int target) {
        Map<Integer,Integer> temp = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++){
            int index = target - nums[i];
            if(temp.containsKey(index)){
                return new int[]{temp.get(index),i};
            }
            temp.put(nums[i],i);
        }
        throw new RuntimeException("不存在");

    }


    /**
     * 最low的，时间复杂度是n的平方
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {


        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = i +1; j < nums.length; j++){
                if(target == nums[i] + nums[j]){
                    return new int[]{i,j};
                }
            }
        }

       throw new RuntimeException("不存在");

    }








}
