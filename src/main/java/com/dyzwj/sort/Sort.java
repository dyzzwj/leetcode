package com.dyzwj.sort;

import java.util.Random;

public class Sort {


    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }


    public static int[] initArr(int length){

        int[] arr = new int[length];

        Random random = new Random();
        for (int i = 0; i <length ; i++) {
            arr[i] = random.nextInt(100);
        }

        return arr;
    }
}
