package demo2_collection_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("java");
        c.add("java");
        c.add("mysql");
        c.add("c");
        System.out.println(c);
        //c.clear();
        System.out.println(c.isEmpty());
        System.out.println(c.size());
        System.out.println(c.contains("java"));

        System.out.println(c.remove("java"));
        System.out.println(c);

        Object[] arr =c.toArray();
        System.out.println(Arrays.toString(arr));

        System.out.println("-----------------");
        Collection<String> c1 = new ArrayList<String>();
        c1.add("java1");
        c1.add("java2");
        Collection<String> c2 = new ArrayList<String>();
        c2.add("java3");
        c2.add("java4");

        c1.addAll(c2);
        System.out.println(c1);
        System.out.println(c2);

    }
}
