package demo2_static_util;

public class ArraysUtils {

    public static String toString(int[] a){
        if(a==null){
            return null;
        }

        String result="[";
        for (int i = 0; i < a.length; i++) {
            result+=i==a.length-1? a[i]:a[i]+",";
        }
        result+="]";
        return result;
    }
    public static double getAverage(int[] a){
        int max=a[0];
        int min=a[0];
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min)
            {
                min=a[i];
            }
            sum+=a[i];
        }
        double ave;
        ave=(sum-max-min)*1.0/(a.length-2);
        return ave;
    }
}
