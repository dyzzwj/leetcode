package com.dyzwj.demo1;


/**
 *
 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

 示例:
 输入: [-2,1,-3,4,-1,2,1,-5,4]
 输出: 6
 解释: 连续子数组 [4,-1,2,1] 的和最大为 6。

 1、最后一步：最后一个数
 子问题：前n-1个元素的最大子序和
 2、转移方程
 f(n) = max(nums[n],f(n-1) + nums[n])



 */
public class MaxSubArray {


    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    public static int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length + 1 ];

        int res = nums[0];
        int pre = 0;
        for (int i = 1 ; i < nums.length; i++){
            dp[i] = Integer.max(dp[i-1]+ nums[i],nums[i]);
//            pre = Integer.max(pre + nums[i],nums[i]);
//            res = Integer.max(res,pre);
        }
        int max = dp[0];
        for (int i = 1; i < dp.length; i++ ){
            max = max > dp[i] ? max : dp[i];
        }
        return max;
    }
}
