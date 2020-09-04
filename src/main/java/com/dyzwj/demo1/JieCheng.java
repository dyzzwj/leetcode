package com.dyzwj.demo1;

/**
 * 递归求阶乘
 */
public class JieCheng {

    public static void main(String[] args) {

        System.out.println(jieCheng(6));
        System.out.println(sum(100));
    }


    /**
     * n! = n * (n-1)!
     * @param num
     * @return
     */
    public static int jieCheng(int num){
        if(num == 1){
            return 1;
        }
        return num * jieCheng(--num);

    }


    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(--n);

    }

}
