package com.dyzwj.demo1;


import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * 单链表反转
 */
public class ListNodeReverse {

    public static void main(String[] args) {

        Map<String,String> map = new Hashtable<>();
        map.put(null,null);
    }


    public static void main1(String[] args) {
        ListNode node6 = new ListNode(6);
        ListNode node5 = new ListNode(5,node6);
        ListNode node4 = new ListNode(4,node5);
        ListNode node3 = new ListNode(3,node4);
        ListNode node2 = new ListNode(2,node3);
        ListNode node1 = new ListNode(1,node2);
        print(node1);
        System.out.println();
        ListNode head = reverseKNode(node1, 2);
//        ListNode head = reverse(node1, 1, 4);
//        ListNode head = reverse(node1);
//        ListNode head = reverseWithRecursion(node1);
        print(head);


    }


    /**
     * 将链表每k个节点逆序一次
     * k = 3
     * 1->2->3->4->5  ===> 3->2->1->4->5
     *
     */
    public static ListNode reverseKNode(ListNode head,int k){

        //首选必须有k个元素
        ListNode curr = head;
        ListNode prev = null;
        ListNode first = null;
        ListNode last = null;
        boolean flag = true;
        int j = 0;
        while (curr != null && hasK(curr,k)){

            for (int i = 0; i < k; i++) {
                if(i == 0){
                    first = curr;
                }
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
                if(i == k-1){

                    if(last != null){
                        last.next = prev;
                    }
                    first.next = curr;
                    last = first;
                }
            }
            if(flag){
                head = prev;
                flag = false;
                prev = null;
            }

        }
        return head;

    }

    /**
     * 判断是否有k个元素
     * @param head
     * @param k
     * @return
     */
    private static boolean hasK(ListNode head,int k){



        ListNode temp = head;
        int i = 0;
        for (; i < k; i++){
            if(temp == null){
                break;
            }
            temp = temp.next;
        }
        return k == i;
    }



    /**
     * 反转一个链表第m到第n个的节点
     *
     * 反转第2个到第4个
     * 1->2->3->4->5  ===> 1->4->3->2->5
     *
     */

    public static ListNode reverse(ListNode head,int m,int n){
        if(m > n){
            throw new RuntimeException("不合法的m、n");
        }
        int index = 1;
        ListNode curr = head;
        ListNode mNode = null;
        ListNode prev = null;

        while (curr != null){

            if(index + 1 == m){
                mNode = curr;
                curr = curr.next;
                index ++;
                continue;
            }

            if(index >= m && index <= n){
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;

            }else if(index == n + 1){
                if(mNode != null){
                    ListNode te = mNode.next;
                    mNode.next = prev;
                    te.next = curr;
                }else {
                    head.next = curr;
                    head = prev;

                }


            }
            index ++;
        }
        return head;

    }


    /**
     * 非递归方式
     * @param head
     * @return
     */
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
//            prev.next = null;
            curr = temp;
        }

        return prev;
    }




    /**
     * 使用递归
     * @param head
     * @return
     */
    public  static ListNode reverseWithRecursion(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        //新的头结点
        ListNode s = reverseWithRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return s;
    }

    public static void print(ListNode node){
        while (node != null){
            System.out.print(node.val + "===>");
            node = node.next;
        }
    }
}
