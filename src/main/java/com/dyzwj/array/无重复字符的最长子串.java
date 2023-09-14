package com.dyzwj.array;

import java.util.HashSet;
import java.util.Set;

/**
 * 题目：给定一个字符串 s ，请你找出其中不含有重复字符的最长子串的长度。
 *
 * 实例1：
 *
 * 复制
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 1.
 * 2.
 * 3.
 * 示例 2:
 *
 * 复制
 * 输入: s = "bbbbb"
 *
 * 输出: 1
 *
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 */
public class 无重复字符的最长子串 {


    public static int aa(String str){
        Set<Character> window = new HashSet<>();
        int length = str.length();
        int i = 0;
        int j = 0;
        int max = 0;
        while (i < length && j <length){
            if(!window.contains(str.charAt(j))){
                window.add(str.charAt(j));
                j++;
                max = Math.max(max, j-i);
            }else {
                window.remove(str.charAt(i));
                i++;
            }

        }



        return max;
    }
}
