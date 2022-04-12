package demo8_api_stringbuilder;

public class stringbuilderdemo2 {
    public static void main(String[] args) {
        //接受数组
        int[] arr={1,2,3,4,5};
        System.out.println(toString(arr));
    }

    public static String toString(int[] arr){
        if(arr!=null){
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i==arr.length-1 ? "":",");
            }
            sb.append("]");
            return sb.toString();
        }
        else{
            return null;
        }
    }
}
