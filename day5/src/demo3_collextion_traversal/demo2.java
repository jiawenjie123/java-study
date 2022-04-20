package demo3_collextion_traversal;

import java.util.ArrayList;
import java.util.Collection;

public class demo2 {
    public static void main(String[] args) {
        //增强for循环
        //可遍历集合和数组
        Collection<String> c1 = new ArrayList<String>();
        c1.add("java1");
        c1.add("java2");
        c1.add("java3");
        c1.add("java4");
        System.out.println(c1);

        for(String e:c1){
            System.out.println(e);
        }
        double[] b={1,2,3,4,5,6};
        for (String s : c1) {
            System.out.println(b);
        }
    }
}
