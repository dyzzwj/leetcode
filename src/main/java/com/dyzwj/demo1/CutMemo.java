package com.dyzwj.demo1;


/**
 * 某公司购买了长钢条，将其切割为短钢条出售。切割工序本身没有成本支出。
 * 公司管理层希望知道最佳的切割方案，使得销售收益最大。
 * 假定我们知道出售一段长为i英寸的钢条的价格为pi，钢条的长度均为整英寸。给出一个价格表的样例如下：
 *
 * 长度   1   2   3   4   5   6   7   8   9   10
 * 价格   1   5   8   9   10  17  17  20  24  30
 */

public class CutMemo {

    /**
     * 1、确定状态
     * dp[i]表示切割 长度为i的最大收益
     * length[]表示长度
     * price[j]表示长度为length[j]的价格
     * 最后一步：最优策略中的最后一段长度length[j]
     * 子问题：长度为i-length[j]的最大收益
     * 2、转移方程
     * dp[i] = max(dp[i],dp[i-length[j] + price[i]);
     *
     * dp[i] = max()
     * 3、初始条件和边界情况
     * dp[0] = 1
     * 4、
     * @return
     */

    public static void main(String[] args) {
        int[] size = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] prices = new int[]{1,5,8,9,10,17,17,20,24,30};
        System.out.println(cutMemo(size, prices, 4));
    }


    public static int cutMemo(int[] size,int[] prices,int length){
        int dp[] = new int[length + 1];
        if(length == 0){
            return 0;
        }

        for (int i = 1 ; i < dp.length; i++){
//            dp[i] = Integer.MIN_VALUE;
            for(int j = 0; j < prices.length; j++){
                if(i >= size[j]){
                    dp[i] = Integer.max(dp[i],dp[i - size[j]] + prices[j]);
                }
            }
        }

        return dp[length];
    }


}
