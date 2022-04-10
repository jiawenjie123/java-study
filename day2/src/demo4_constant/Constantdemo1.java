package demo4_constant;

public class Constantdemo1 {

    public static final String SCHOOL_NAME="tjlg";
    //一处定义多处使用 方便修改
    //在编译阶段会进行宏替换 把使用常量的地方全换成真时的自变量 提高性能

    public static void main(String[] args) {
        System.out.println(SCHOOL_NAME);
    }


}
