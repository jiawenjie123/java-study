package demo7_extends_field_method;

public class Test {
    public static void main(String[] args) {
        Tiger tiger=new Tiger();
        tiger.eat();
        tiger.lookdoor();
        tiger.showname();//先用局部
    }
    //继承后成员的访问特点 就近原则
    //出现重复的，优先使用子类
    //可以用super访问父类内容
}
class Aniaml{
    String name="动物园";
    public void eat()
    {
        System.out.println("吃");
    }
    public static String location="动物园";
}
class Tiger extends Aniaml
{

    public String name="hu";
    public void lookdoor(){
        System.out.println("开门");
    }
    public void showname(){
        String name="局部";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);

        eat();
        super.eat();
    }
    public void eat()
    {//方法重写
        System.out.println("吃的多");
    }
}