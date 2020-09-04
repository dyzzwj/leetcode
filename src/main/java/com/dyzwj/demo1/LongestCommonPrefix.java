package com.dyzwj.demo1;


/**
 *
 编写一个函数来查找字符串数组中的最长公共前缀。

 如果不存在公共前缀，返回空字符串 ""。

 示例 1:

 输入: ["flower","flow","flight"]
 输出: "fl"
 示例 2:

 输入: ["dog","racecar","car"]
 输出: ""
 解释: 输入不存在公共前缀。
 说明:

 所有输入只包含小写字母 a-z 。
 */

public class LongestCommonPrefix {


    public static void main(String[] args) {

        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));

    }

    public static String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        for (int i = 1; i < strs.length; i++) {
            str = commonPrefix(str,strs[i]);
        }
        return str;
    }

    //逐个字符进行比较
    public static String commonPrefix(String str1,String str2){

        int min = Math.min(str1.length(), str2.length());
        int index = 0;
        while(index < min && str1.charAt(index) == str2.charAt(index)){
            index++;
        }
        return str1.substring(0,index);

//        String less = str1.length() > str2.length() ? str2 : str1;
//        String more = str1.length() > str2.length() ? str1 : str2;
//        if(less.length() == 0 ){
//            return "";
//        }
//        String pre = less.substring(0,1);
//        int i = 1;
//        while (more.startsWith(pre) && i < less.length()){
//
//            pre = less.substring(0,++i);
//        }
//
//        return pre.substring(0,i-1);
    }





}
