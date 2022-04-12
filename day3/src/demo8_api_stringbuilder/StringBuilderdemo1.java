package demo8_api_stringbuilder;

public class StringBuilderdemo1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("a");
        sb.append(1);
        //方便操作
        System.out.println(sb);

        StringBuilder sb1=new StringBuilder("yi");
        sb1.append(2).append(3);//支持链式编程
        System.out.println(sb1);

        sb1.reverse().append(100);
        System.out.println(sb1);
        System.out.println(sb1.length());
        //拼接字符串手段 最终还是恢复成string
        //恢复方法
        String rs=sb1.toString();
    }
}
