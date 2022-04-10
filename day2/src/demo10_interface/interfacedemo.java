package demo10_interface;

public interface interfacedemo {
    //只能有常量和抽象方法
    public static final String name="zhangsan";

    public abstract void run();
    void eat();
}
//体现一种规范，一定是公开的 都是public  方法默认加public abstract
