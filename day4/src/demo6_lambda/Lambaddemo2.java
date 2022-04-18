package demo6_lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Lambaddemo2 {
    public static void main(String[] args) {
        Integer[] arr={1,1,2,435,62};
//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//
//                return o2-o1;
//                //降序
//            }
//        });
        Arrays.sort(arr, ( o1, o2)-> o2-o1);
        //参数类型可以不写 如果只有一个参数 （）可以不写
        //方法体代码只有一行 大括号可以不写 去掉; 如果是retunrn语句 return也不写
        System.out.println(Arrays.toString(arr));
    }
}
