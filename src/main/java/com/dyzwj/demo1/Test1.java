package com.dyzwj.demo1;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName Test1.java
 * @Description TODO
 * @createTime 2020年07月20日 19:09:00
 */

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @title
 * @description 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * @author zhengwenjie
 * @updateTime 2020-07-20 19:09
 * @throws
 */
public class Test1 {


    public static void main(String[] args) {
        test1(2);

    }


    public static void test1(Integer n){

        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        int count = linkedList.size();
        if(n  > count){
            System.out.println("n不合法");
            return;
        }

        Iterator<Integer> iterator = linkedList.iterator();

        int size = 0;
        Integer first = 0;
        while (iterator.hasNext()){
            Integer current = iterator.next();
            if(size == 0){
                first = current;
            }
            if(size == count - n){
                iterator.remove();
                break;
            }
            size++;
        }
        linkedList.forEach(System.out::println);


    }



    public void test2(ListNode listNode,Integer num){
        ListNode head = listNode;




    }


}
