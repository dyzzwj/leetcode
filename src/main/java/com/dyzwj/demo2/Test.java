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
        System.out.println(getDivision(10));
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
