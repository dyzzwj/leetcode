package com.dyzwj.demo1;

/**
 *实现 int sqrt(int x) 函数。
 *
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 *
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 *
 */
public class MySqrt {


    public static void main(String[] args) {
        System.out.println(sqrt(2147395599));
        System.out.println(Math.sqrt(2147395599));
    }



    public static int mySqrt(long number) {
        return 0;
    }



    /**
     * 二分查找
     * @param
     * @return
     */
    public static int sqrt(int number) {
        if (number <= 0) {
            return -1;
        }
        if (number < 1) {
            return 0;
        }
        if (number < 2) {
            return 1;
        }
        int left = 0;
        int right = number;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (number < mid * mid) {
                right = mid;
            } else if (number >= mid * mid && number < (mid + 1) * (mid + 1)) {
                return mid;
            } else {
                left = mid;
            }
        }

        return -1;
    }

}
