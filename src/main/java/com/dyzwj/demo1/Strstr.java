package com.dyzwj.demo1;

/**
 *
 实现 strStr() 函数。

 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。
 如果不存在，则返回  -1。

 示例 1:

 输入: haystack = "hello", needle = "ll"
 输出: 2
 示例 2:

 输入: haystack = "aaaaa", needle = "bba"
 输出: -1
 */
public class Strstr {


    public static void main(String[] args) {

        String str1 = "mississippi";

        String str2 = "issip";
        str1 = "a";
        str2 = "a";
        System.out.println(strStr2(str1, str2));
    }

    public static int strStr2(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }
        if (needle.length() > haystack.length()) {
            return -1;
        }
        char c = needle.charAt(0);
        for(int j = 0,k = 0; j < haystack.length() - needle.length() + 1; j++){
            int indexOf = haystack.indexOf(c,k);
            k = indexOf + 1;
            if(indexOf == -1){
                return -1;
            }
            int i = 0;
            while (i < needle.length() && indexOf < haystack.length() && haystack.charAt(indexOf) == needle.charAt(i)){
                i++;
                indexOf++;

            }
            if(i == needle.length()){
                return indexOf - i;
            }
        }
        return -1;
    }










        /**
         * 通过滑动窗口
         * @param haystack
         * @param needle
         * @return
         */
    public static int strStr1(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }
        if (needle.length() > haystack.length()) {
            return -1;
        }

        for (int i = 0; i < haystack.length() - needle.length(); i++) {
            if(haystack.substring(i, i + needle.length()).equalsIgnoreCase(needle)){
                return i;
            }
        }
        return -1;
    }
}
