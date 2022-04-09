package demo3_static_code;

public class Staticdemo2 {
    private String name;
    public Staticdemo2(){
        System.out.println("无参构造器执行");
    }
    //实例代码块 无static修饰 属于对象 每次构建对象，会触发一次执行
    //见得少 初始化实例资源 但一般不用
    {
        name="张三";
        System.out.println("实例代码块执行");//先于构造器执行
    }

    public static void main(String[] args) {
        Staticdemo2 s1=new Staticdemo2();

    }
}
