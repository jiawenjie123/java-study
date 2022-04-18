package demo4_api_arrays;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //Arrays 常用api
        int[] array = {0,5,3,7,2,1};
        System.out.println(array);
        String rs= Arrays.toString(array);
        System.out.println(rs);
        //数组内容
        //排序 自动升序排序
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        //二分搜索 前提数组排好序（数据量大时优秀）

        System.out.println(Arrays.binarySearch(array, 7));
        System.out.println(Arrays.binarySearch(array, 4));
        //不存在的位置 不存在的元素应该在的位置的负数+1


    }
}
