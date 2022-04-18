package demo5_sort;

import java.lang.reflect.Array;
import java.util.Arrays;


public class Test2 {
    public static void main(String[] args) {
        int [] arr={9,8,1,5,74,0,2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(binarysearch(arr,10));


    }
    public static int binarysearch(int[] arr,int i){
        //定义左边和右边
        int left =0;
        int right =arr.length-1;

        while(left < right){
            //取中间索引
            int mid=(left+right)/2;
            if(i>arr[mid]){
                left=mid+1;
            }else if (i<arr[mid]){
                right=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
