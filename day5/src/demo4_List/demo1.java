package demo4_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        //经典代码
        list.add("java1");
        list.add("java2");
        list.add("java3");
        list.add("java4");
        //遍历
        // 迭代式
        //foreach
        //lambda
        //for 索引
        list.add(2,"java5");
        System.out.println(list);
        System.out.println(list.get(3));
        //arraylist底层基于数组 查询块 增删慢
        //第一次创建集合并添加第一个元素 在底层创建一个默认长度为10的数组
        //慢后扩容1.5倍

        //linkedlist 基于双链表 查询元素慢 增删首尾元素很快
        LinkedList<String> stack = new LinkedList<String>();
        stack.addFirst("1");
        //入栈
        stack.addFirst("2");
        stack.addFirst("3");
        stack.addFirst("4");
        System.out.println(stack.removeFirst());
        System.out.println(stack);

        LinkedList<String> queue = new LinkedList<String>();
        //队列
        queue.addLast("1");
        queue.addLast("2");
        queue.addLast("3");
        queue.addLast("4");
        System.out.println(queue.removeFirst());
        System.out.println(queue);













    }
}
