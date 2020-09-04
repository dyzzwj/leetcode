package com.dyzwj.demo1;

/**
 * 斐波拉契数列
 */
public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(recursion(8));
        System.out.println(fibonacci(8));
        System.out.println(fib1(8));
        System.out.println(fib2(8));
    }


    /**
     * 无需额外开辟数组
     * @param target
     * @return
     */
    public static int fib2(int target){
        int memo_i = 0;
        int memo_i_1 = 1;
        int memo_i_2 = 0;

        for (int i = 2; i <= target;i++){
            memo_i = memo_i_1 + memo_i_2;
            memo_i_2 = memo_i_1;
            memo_i_1 = memo_i;
        }
        return memo_i;

    }



    /**
     * 不使用递归自底向上求解
     * @param target
     * @return
     */
    public static int fib1(int target){

        int[] memo = new int[target + 1];
        memo[0] = 0;
        memo[1] = 1;
        for (int i = 2; i <= target; i++){
            memo[i] = memo[i-1] + memo[i-2];
        }
        return memo[target];
    }





    /**
     *备忘录法：使用递归避免重复计算
     * @return
     */
    public static int fibonacci(int target){
        if(target <= 0){
            return 0;
        }
        int[] memo = new int[target + 1];
        for(int i = 0; i <= target;i++){
            memo[i] = -1;
        }
        return fib(target,memo);

    }


    public static int fib(int num,int[] memo){

        if(memo[num] != -1){
            return memo[num];
        }
        if(num <= 2){
            memo[num] = 1;
        }else {
          memo[num] = fib(num-1,memo) + fib(num - 2,memo);
        }
        return memo[num];
    }






    /**
     * 递归求解
     * @param target
     * @return
     */
    public static int recursion(int target){
        if(target <= 0){
            return 0;
        }
        if (target == 1){
            return 1;
        }

        return recursion(target-1) + recursion(target - 2);

    }

}
