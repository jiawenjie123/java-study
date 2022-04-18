package demo5_sort;

import java.util.Arrays;
//选择排序
public class Test1 {
    public static void main(String[] args) {
        int[] arr={5,1,3,2};
        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length-1; j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
