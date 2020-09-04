package com.dyzwj.demo1;

/**
 * 假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少？
 * 解析：即前i日的最大价格
 *
 *
 * dp[i]=max(dp[i−1],prices[i]−min(prices[0:i]))
 *
 *前i日最大利润 = max(前i-1日最大利润,第i日价格-前i日最低价格)
 *
 *
 */
public class MaxProfit {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));

    }

    public static int maxProfit(int[] prices){
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            min = Integer.min(prices[i],min);
            profit = Integer.max(profit,prices[i] - min);
        }
        return profit;
    }


}
