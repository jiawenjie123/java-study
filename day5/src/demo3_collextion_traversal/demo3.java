package demo3_collextion_traversal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class demo3 {


    public static void main(String[] args) {
        //lambda 遍历集合
        Collection<String> c1 = new ArrayList<String>();
        c1.add("java1");
        c1.add("java2");
        c1.add("java3");
        c1.add("java4");
        System.out.println(c1);
        c1.forEach(s -> System.out.println(s));
    }
}

