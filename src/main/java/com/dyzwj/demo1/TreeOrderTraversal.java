package com.dyzwj.demo1;

/**
 * 树的遍历（递归）
 *
 * 先序、中序、后续：遍历过程中经过节点的路线一下，只是访问各节点的时机不一样
 *
 */
public class TreeOrderTraversal<T> {


    private T data;

    private TreeOrderTraversal<T> right;

    private TreeOrderTraversal<T> left;

    public TreeOrderTraversal(T data) {
        this.data = data;
    }

    public TreeOrderTraversal() {
    }

    /**
     * 先序遍历   root -> left -> right
     */
    public void preOrderTraversal(TreeOrderTraversal root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }


    /**
     * 中序遍历 left -> root -> right
     * @param root
     */
    public void inOrderTraversal(TreeOrderTraversal root){
        if(root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root.data);
        inOrderTraversal(root.right);
    }

    /**
     * 后续遍历 left -> right -> root
     * @param root
     */
    public void postOrderTraversal(TreeOrderTraversal root){
        if(root == null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.data);
    }



        public static void main(String[] args) {

        TreeOrderTraversal<Integer> root = new TreeOrderTraversal<>(1);
        TreeOrderTraversal<Integer> left1 = new TreeOrderTraversal<>(2);
        TreeOrderTraversal<Integer> right1 = new TreeOrderTraversal<>(3);
        TreeOrderTraversal<Integer> right11 = new TreeOrderTraversal<>(4);
        TreeOrderTraversal<Integer> right12 = new TreeOrderTraversal<>(5);
        TreeOrderTraversal<Integer> left11 = new TreeOrderTraversal<>(6);
        TreeOrderTraversal<Integer> left12 = new TreeOrderTraversal<>(7);

        root.left = left1;
        root.right=right1;
        left1.left = left11;
        left1.right = left12;
        right1.left = right11;
        right1.right = right12;

//        root.preOrderTraversal(root);
        root.postOrderTraversal(root);
    }





}
