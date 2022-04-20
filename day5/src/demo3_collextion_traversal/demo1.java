package demo3_collextion_traversal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class demo1 {
    public static void main(String[] args) {
        //迭代器
        Collection<String> c1 = new ArrayList<String>();
        c1.add("java1");
        c1.add("java2");
        c1.add("java3");
        c1.add("java4");
        System.out.println(c1);


       //1得到迭代器对象
        Iterator<String> it = c1.iterator();
        while(it.hasNext()) {
            //有无下一个元素
            String e=it.next();

            System.out.println(e);
        }

    }
}
