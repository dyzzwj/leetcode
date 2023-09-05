package com.dyzwj.demo2;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName Test.java
 * @Description TODO
 * @createTime 2020年08月11日 21:38:00
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }


    public static boolean isPalindrome(int x) {
        int num;
        int right = 0;
        while(x > 0){
            num = x % 10;
            x = x / 10;
            right = right * 10 + num;
            if(right == x || right == x / 10 ){
                return true;
            }
        }
        return false;
    }

    public static int reverse(int x) {
        boolean flag = false;
        if(x < 0){
            x = -x;
            flag = true;
        }
        int num = 0;
        int res = 0;
        while (x > 0){
            num = x % 10;
            x = x / 10;
            res = res * 10 + num;
        }

        return flag ? -res : res;
    }

    public static int getDivision(int n){
        try{
            n+=1;
            if(n/0 > 0){
                n+=10;
            } else {
                n-=10;
            }return n;
        }catch(Exception e){
            n++;
        }
        n++;
        return n++;
    }





}
