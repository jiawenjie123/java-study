package demo1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class demo1 {
    public static void main(String[] args) {
        //有序 可重复 有索引
        Collection<String> list = new ArrayList<>();
        list.add("java");
        list.add("java");
        //list.add(1);
        System.out.println(list);
        //无序不重复 索引
        Collection list1 = new HashSet();
        list1.add("java");
        list1.add("java");
        list1.add(1);
        System.out.println(list1);
    }
}
