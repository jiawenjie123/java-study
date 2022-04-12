package demo3_innerclass_static;

public class Test {
    public static void main(String[] args) {
        Outer.inner in=new Outer.inner("张三");
        Outer.inner1 in1=new Outer().new inner1();//成员类
        //成员类可以访问外部类静态变量
        //可以访问外部类实例变量


    }
}
