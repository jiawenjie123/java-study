package demo6_genericity;

import java.util.ArrayList;

public class demo1 {
    public static void main(String[] args) {
        //泛型
        //避免强转风险
        //默认arraylist 定义一myarraylist
        //泛型类定义
        MyArrayList<String> list=new MyArrayList<>();
        list.add("java1");
        list.add("java1");
        list.add("java3");
        list.add("java4");
        list.remove("java4");
        //只能操作string
        System.out.println(list);


       String[] names = {"jia","wen","jie"};
       Integer[] ages={1,2,3};
       Integer[] heights=null;
       show(names);
       show(ages);
       show(heights);

    }
    //泛型方法 具有通用性
    public static <E>void show(E[] array){

        if(array!=null){
            StringBuilder sb = new StringBuilder("[");
            for(int i=0; i<array.length;i++){
                sb.append(array[i]).append(i==array.length-1? "":",");
            }
            sb.append("]");
            System.out.println(sb);
        }
        else{
            System.out.println(array);
        }

    }
}

class MyArrayList<E>{

    private ArrayList list=new ArrayList();
    public void add(E element){
        list.add(element);

    }
    public void  remove(E element){
        list.remove(element);
    }

    @Override
    public String toString() {
        return list.toString();
    }

}