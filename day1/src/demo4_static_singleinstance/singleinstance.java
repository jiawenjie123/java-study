package demo4_static_singleinstance;

public class singleinstance {
    //使用饿汉单例实现单例类
    //构造器私有化
    //获取对象前，对象已经准备好了一个
    public static singleinstance instance=new singleinstance();
    private  singleinstance(){}


}
