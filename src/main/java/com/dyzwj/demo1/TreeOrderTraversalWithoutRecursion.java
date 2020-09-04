package com.dyzwj.demo1;

/**
 * 使用堆栈的方式遍历树（非递归的方式）
 *
 */
public class TreeOrderTraversalWithoutRecursion {

    /**中序遍历栈方式：
     * 1、遇到一个节点，就把他压栈，并去遍历它的左子树
     * 2、当左子树遍历结束后，从栈顶弹出这个节点并访问它
     * 3、然后按其右指针再去中序遍历该结点的右子树，如果没有右子树，从栈顶弹出一个结点并访问它，再去中序遍历这个结点的右子树
     */


    /**
     * 中序遍历栈方式
     * 栈的中序遍历需要套两层循环，由于需要先输出左节点，必须向下查找直到左节点为空才能输出。
     * 1、如果栈顶元素非空且左节点存在，将其入栈，重复该过程。若不存在则进入第2步
     * 2、若栈非空，输出栈顶元素并出栈。判断刚出栈的元素的右节点是否存在，不存在重复第2步，存在则将右节点入栈，跳至第1步
     */



    /**
     * 前序遍历：
     * 1、若栈非空输出根节点，并出栈
     * 2、将右节点压栈（如果存在）
     * 3、将左节点压栈（如果存在）
     * 4、重复第1步直到栈空
     *
     *
     */

}