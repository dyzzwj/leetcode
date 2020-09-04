package com.dyzwj.demo1;

import java.util.Arrays;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName Sort.java
 * @Description TODO
 * @createTime 2020年08月06日 19:34:00
 */
public class Sort {


    public static void main(String[] args) {

        int[] arr = new int[]{6,4,3,5,7,9,8,2};
        test3(arr);
    }


    /**
     * 1、把长度为n的输入序列分成两个长度为n/2的子序列；
     * 2、对这两个子序列分别采用归并排序；
     * 3、将两个排序好的子序列合并成一个最终的排序序列。
     */
    public static void test4(){


    }




    /**
     * 插入排序
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     * 1、从第一个元素开始，该元素可以认为已经被排序；
     * 2、取出下一个元素，在已经排序的元素序列中从后向前扫描；
     * 3、如果该元素（已排序）大于新元素，将该元素移到下一位置；
     * 4、重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
     * 5、将新元素插入到该位置后；
     * 6、重复步骤2~5。
     */
    public static void test3(int[] arr){
//        int pre,current;
//        for (int i = 1; i < arr.length; i++) {
//            pre = i - 1;
//            current = i;
//            while (pre >= 0 && arr[current] > arr[pre] ){
//                int temp = arr[current];
//                arr[current--] = arr[pre];
//                arr[pre--] = temp;
//            }
//        }

        int pre,current;
        for (int i = 1; i < arr.length; i++) {
            pre = i - 1;
            current = arr[i];
            while (pre >= 0 && current < arr[pre]){
                arr[pre + 1] = arr[pre];
                pre--;
            }
            arr[pre + 1] = current;

        }



        System.out.println(Arrays.toString(arr));

    }



    /**
     * 选择排序：每次循环找出最小的
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     * n个记录的直接选择排序可经过n-1趟直接选择排序得到有序结果。具体算法描述如下
     * 初始状态：无序区为R[1..n]，有序区为空；
     * 第i趟排序(i=1,2,3…n-1)开始时，当前有序区和无序区分别为R[1..i-1]和R(i..n）。该趟排序从当前无序区中-选出关键字最小的记录 R[k]，将它与无序区的第1个记录R交换，使R[1..i]和R[i+1..n)分别变为记录个数增加1个的新有序区和记录个数减少1个的新无序区；
     * n-1趟结束，数组有序化了。
     * @param arr
     */

    public static void test2(int[] arr){
        if(arr.length == 0){
            return ;
        }
        int min,minIndex;
//        for (int i = 0; i < arr.length -1; i++){
//            min = arr[i];
//            minIndex = i;
//            for(int j = i; j < arr.length; j++){
//                if(min > arr[j]){
//                    min = arr[j];
//                    minIndex = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[minIndex];
//            arr[minIndex] = temp;
//        }

        for(int i = 0; i < arr.length; i++){
            minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
//                    arr[j] = arr[minIndex];
                    minIndex = j;
                }
            }

        }



        System.out.println(Arrays.toString(arr));

    }

    /**
     * 冒泡排序
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     * 1、比较相邻的元素。如果第一个比第二个大，就交换它们两个；
     * 2、对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
     * 3、针对所有的元素重复以上的步骤，除了最后一个；
     * 4、重复步骤1~3，直到排序完成。
     */
    public static void test1(int[] arr){
     for (int i = 0; i < arr.length - 1; i++){
         for (int j = 0; j < arr.length - i -1; j++) {
             if(arr[j] > arr[j+1]){
                 int temp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1] = temp;
             }
         }

     }

        System.out.println(Arrays.toString(arr));
    }


    /**
     * Give a array which contain odd number, even number and 0.
     * Goal: select Kth odd number , if exists return it otherwise return -1.
     *      Time complexity less then O(n^2), space complexity as small as possible.
     * format:
     *     // explain time complexity and space complexity
     *     public int getKthOdd(int[] arr, int k){
     *         // implement
     *     }
     */

    /**获取第k个奇数
     *时间复杂度：O(n)
     *空间复杂度：O(1)
     */
    public int getKthOdd(int[] arr, int k){
        if(arr == null || arr.length <= k - 1){
            return -1;
        }
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if((arr[i] & 1) == 1){

                if(++counter == k){
                    return arr[i];
                }
            }
        }
        return -1;

    }





}
