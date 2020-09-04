package com.dyzwj.demo1;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName TryCatchFinally.java
 * @Description TODO
 * @createTime 2020年08月07日 14:15:00
 */
public class TryCatchFinally {

    public static void main(String[] args) {

//        int i = 0;
//        int j = i++ + i;
//        //  j = 0 + 1
//        System.out.println(j); //1
        System.out.println(test3());

    }


    public  static int test3(){
        try{
            int i = 10 / 0;
            return 1;
        }catch(Exception e){
            System.out.println("exception...");
            return method();
        } finally{
            System.out.println("finally...");
            return 2;
        }
    }

    public static int test2(){


        try{
            int i = 10 / 0;
        } catch(Exception e){
            System.out.println("exception...");
            return 1;
        }
        System.out.println("hahahh");
        return 2;
    }

    public static int test1(){

        int i = 0;
        try{
            return i++;
        }catch(Exception e){

        } finally {
            i = 9;
            System.out.println("finally..." + i);
        }
        return 20;

    }

    public static int method(){
        System.out.println("method...");
        return 4;
    }




}
