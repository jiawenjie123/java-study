package demo2_static_util;

public class test {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        System.out.println(ArraysUtils.toString(a));
        System.out.println(ArraysUtils.getAverage(a));
    }
}
