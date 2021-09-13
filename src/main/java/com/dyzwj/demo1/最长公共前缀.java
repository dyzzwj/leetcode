package com.dyzwj.demo1;

public class 最长公共前缀 {


    public static void main(String[] args) {

        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }

    public static String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            prefix = longestCommonPrefix1(prefix,strs[i]);
        }

        return prefix;
    }

    public static String longestCommonPrefix1(String str1,String str2){

        int s = str1.length() > str2.length() ? str2.length() : str1.length();
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < s; k++) {
            if(str1.charAt(k) == str2.charAt(k)){
                sb.append(str1.charAt(k));
            }else{
                return sb.toString();
            }
        }
        return sb.toString();
    }
}
