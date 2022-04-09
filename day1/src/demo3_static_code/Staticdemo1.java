package demo3_static_code;

import java.util.ArrayList;

public class Staticdemo1 {

    public static String shoolnanme;
    public static ArrayList<String> cards=new ArrayList<>();
    //静态代码块 属于类 与类一起优先加载一次 自动触发执行
    //作用初始化静态资源

    static {
        System.out.println("-----静态代码块触发-------");
        shoolnanme="tjlg";
        cards.add("3");
        cards.add("4");
    }
    public static void main(String[] args) {
        System.out.println("-----main-----");
        System.out.println(shoolnanme);
    }
}
