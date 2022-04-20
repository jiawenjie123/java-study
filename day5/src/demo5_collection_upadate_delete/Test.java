package demo5_collection_upadate_delete;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("java1");
        list.add("java2");
        list.add("java");
        list.add("java");
        //迭代器 删除所有java
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            String s = it.next();
            if("java".equals(s)){
                it.remove();
                //迭代器删除当前元素且不会后移 内部做了i--
                //list.remove("java");
            }
        }
        System.out.println(list);
        //增强for
//        for (String s : list) {(出现bug)
//            if("java".equals(s))
//            {
//                list.remove("java");
//            }
//
//        }
        //lambda
//        list.forEach(s->{(出现bug)
//            if("java".equals(s)){
//                list.remove("java");
//            }
//        });
        //for循环
        //for (int i = 0; i < list.size(); i++) 该为逆序靠谱
        for (int i = list.size() - 1; i >= 0; i--){
            String s = it.next();
            if("java".equals(s)){
                list.remove("java");
            }
        }//不出bug 但会漏删

    }
}
