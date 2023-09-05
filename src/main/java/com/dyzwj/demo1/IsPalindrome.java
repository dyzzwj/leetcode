package com.dyzwj.demo1;


/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 *
 * 输入: 121
 * 输出: true
 * 示例2:
 *
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 *
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 *
 * 进阶:
 * 你能不将整数转为字符串来解决这个问题吗？

 */
public class IsPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindromeByStr(234565432));
    }

    //比较回文数和原值
    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        if(x % 10 == 0 && x != 0){
            return false;
        }
        int num = 0;
        while (x > num){
            int temp = x % 10;
            num = num * 10 + temp;
            x /= 10;
        }
        return (num == x) || (num / 10 == x);

    }

    //int转字符串方式
    public static boolean isPalindromeByStr(int x){

        char[] chars = String.valueOf(x).toCharArray();
        int left = 0;
        int right = chars.length -1;
        while (left <= right){
            if(chars[right--] == chars[left++]){
                continue;
            }
            return false;
        }

        return true;
    }
}
