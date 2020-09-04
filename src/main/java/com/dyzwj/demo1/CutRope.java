package com.dyzwj.demo1;

import java.util.Arrays;

/**
 *
 * 给你一根长度为n的绳子，请把绳子剪成m段（m、n都是整数，n>1并且m>1），每段绳子的长度记为k[0],k[1],...,k[m-1]。
 * 请问k[0]*k[1]*...*k[m-1]可能的最大乘积是多少？例如
 *
 * 1、确定状态
 * 最后一步（最优策略中使用的最后一枚硬币ak）
 * 最后一段绳子长度k[m-1]
 *
 * 子问题 最少的硬币拼出更小的面值27-ak
 * 长度为n-k[m-1]的的最大乘积
 *
 *
 * 2、转移方程
 * f(n) = max(f(n),k[m-1]*f(n-k[m-1]))
 *
 *
 *
 *
 *
 *
 * f(n) = max(f(n),(i) * f[n-i])
 *
 *
 * 3、初始条件和边界情况
 * 初始条件是用转移方程看不出来的，需要进行手工定义
 *
 * 4、计算顺序
 * 从小到大还是从大到小？？
 * 要用到的状态要先于左边的f(x)存在
 *
 *
 */


public class CutRope {

    public static void main(String[] args) {
        System.out.println(cutRope(3));
        System.out.println(cutRope1(3));
    }


    /**
     * 动态规划
     * dp[i] = max(dp[i],j * dp[i-j])
     *
     * @return
     */
    public static int cutRope3(int target){


        return 0;
    }




    /**
     * 动态规划
     * f(n) = max(f(n),max(i,f(i)) * max((i-j),f(i-j)))
     * @param target
     * @return
     */
    public static int cutRope1(int target){

        int[] dp = new int[target + 1];

        //已知状态

        dp[1] = 1;

        for (int i = 2; i <= target; i++){
            for(int j = 1; j < i; j++){
                dp[i] = Integer.max(dp[i],Integer.max(j,dp[j]) * Integer.max(i-j,dp[i-j]));
            }
        }

        return dp[target];
    }



    /**
     * 数学分析后的结果
     * @param target
     * @return
     */
    public static int cutRope(int target) {

        return 0;
    }
}
