package com.dyzwj.demo2;


/**
 * 实现String.indexOf(String str)的方法
 *
 */
public class IndexOf {


    public static void main(String[] args) {
        String source = "abcddab";
        String target = "abd";

        System.out.println(indexOf(source,target));
        System.out.println(source.indexOf(target));
    }
    public static int indexOf(String source,String target){
        if(source == null || target == null){
            return -1;
        }
        if(source.length() < target.length()){
            return -1;
        }
        int res = -1;
        int i = 0;
        int j = 0;
        char[] sArray = source.toCharArray();
        char[] tArray = target.toCharArray();
        while (i < sArray.length && j < tArray.length){
            if(sArray[i] == tArray[j]){
                j++;
            }else {
                j = 0;
            }
            i++;
        }

        if(j == tArray.length){
            return i - j;
        }

        return -1;
    }
    public static boolean isSubsequence(String s, String t) {
        int n = s.length(), m = t.length();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == n;
    }



    public static boolean indexOf1(String source,String target){
        if(source == null || target == null){
            return false;
        }
        if(source.length() < target.length()){
            return false;
        }

        int i = 0;
        int j = 0;
        char[] chars = source.toCharArray();
        char[] chars1 = target.toCharArray();
        while(i < chars.length && j < chars1.length){
            if(chars[i] == chars1[j]){
                i++;
            }
            j++;
        }

        return j == chars1.length;
    }
}
