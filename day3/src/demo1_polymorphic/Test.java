package demo1_polymorphic;

public class Test {
    public static void main(String[] args) {
        //多态形式 父类对象 对象名 =new 子类构造器
        Animal a=new Dog();
        a.run();//方法调用编译看左 运行看右边
        System.out.println(a.name);
        Animal a1=new Tortoise();
        a1.run();
        System.out.println(a1.name);//变量 编译看左边 运行看右边
        System.out.println("-------");
        go(a);
        go(a1);
        System.out.println("---------");
        Tortoise t=(Tortoise)a1;//父类类型到子类类型强制转换
        t.egg();//解决了不能使用子类独有功能
        Dog d=(Dog)a1;//注意 编译不报错
        //d.lookdoor();//报错
        if (a instanceof Tortoise){
            Tortoise t1=(Tortoise)a; }
        else if(a instanceof Dog){
            Dog d1=(Dog)a;
        }//先判断


    }
    public static void go(Animal a){
        System.out.println("开始");
        a.run();
        System.out.println("结束");
    }//多态优点便于维护
    //多态不能使用子类独有功能
}
