package demo6_6_extends_feature;

public class Test {
    public static void main(String[] args) {
        //不能继承父类构造器
        //可以继承父类私有成员，不能直接访问
        Tiger t=new Tiger();
        System.out.println(Tiger.location);//不算继承静态成员，只是共享
        //只支持单继承  支持多层继承
        // 为什么不支持多继承 会出现冲突歧义
        //默认继承object 祖宗类

    }
}

class Aniaml{
    private void eat()
    {
        System.out.println("吃");
    }
    public static String location="动物园";
}
class Tiger extends Aniaml
{

}
