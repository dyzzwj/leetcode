package com.dyzwj.demo1;

/**
 * 汉诺塔：
 *
 * 从左到右有A、B、C三根柱子，其中A柱子上面有从小叠到大的n个圆盘，现要求将A柱子上的圆盘借助B移到C柱子上去，
 *  期间只有一个原则：一次只能移到一个盘子且大盘子不能在小盘子上面，求移动的步骤和移动的次数
 *
 *
 *
 */
public class HanNuoTa {

    public static void main(String[] args) {

        hanNuoTa(3,'a','b','c');
    }


    /**
     * 将A柱子上的圆盘借助B移到C
     * 1、如果是一个盘子，直接将A柱子上的盘子移到C
     * 2、否则
     *  先将A上的n-1个盘子借助C移到B
     *  直接将A上的盘子从A移到C
     *  最后将B上的n-1个盘子借助A移到C
     *
     *
     * 参数说明：
     * n：初始A柱子上的圆盘个数
     * a：放圆盘的柱子
     * b：借助的柱子
     * c：
     *
     */
    public static void hanNuoTa(int n,char a,char b,char c){
        if(n == 1){
            System.out.println(String.format("==将编号为%d的盘子从%s移到%s",n,a,c));
        }else {
            //
            hanNuoTa(n-1,a,c,b);
            System.out.println(String.format("--将编号为%d的盘子从%s移到%s",n,a,c));
            hanNuoTa(n-1,b,a,c);
        }
    }

    //
}
