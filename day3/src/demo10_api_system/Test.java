package demo10_api_system;

import java.lang.reflect.Array;

public class Test {
    public static void main(String[] args) {
        //system也是直接用类名调用方法
        System.out.println("程序开始");

        //System.exit(0);//JVM终止

        long starttime = System.currentTimeMillis(); //时间毫秒值 从1970年1月1日00:00:00 到此刻的毫秒数

        //进行时间的计算
        for (int i = 0; i < 100000; i++) {
            System.out.println("输出"+i);

        }
        long endtime=System.currentTimeMillis();
        System.out.println((endtime-starttime)/1000.0+"s");
        //数组拷贝，了解
        //1 被拷贝的数组
        // 2 从哪个索引开始
        // 3 复制的数组
        //4 粘贴位置
        //5拷贝元素个数
        int[] array ={1,2,3,4,5,6,7};
        int[] array1=new int[6];
        System.arraycopy(array,3,array1,2,3);

    }
}
