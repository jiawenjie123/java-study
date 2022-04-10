package demo6_abstract;

public abstract class Animal {
    //抽象类
    //理解为不完整的设计图，一般为父类，让子类继承
    //每个子类都有这种方法 但又不一样
    public abstract void run();
    //抽象方法 不能写方法体代码
    // 在子类中必须被重写

}
